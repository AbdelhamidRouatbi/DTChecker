"""
specs.py  –  SpecManager

Helper imported by every monitor.py script that the Xtext code generator emits.
It wraps RTAMT spec objects and posts robustness results back to the Flask backend
via the /push endpoint.
"""

import json
import os

import requests
import rtamt

# Where to reach the Flask backend.  Defaults to localhost for non-Docker usage.
FLASK_URL = os.environ.get("FLASK_URL", "http://localhost:5000")


class SpecManager:
    def __init__(self):
        self._specs: dict[str, rtamt.StlDenseTimeSpecification] = {}
        self._formulas: dict[str, str] = {}
        # Maps signal name → list of spec names that reference it
        self._signal_to_specs: dict[str, list[str]] = {}

    # ------------------------------------------------------------------
    def addSpec(self, name: str, formula: str) -> None:
        """Register a named STL specification."""
        spec = rtamt.StlDenseTimeSpecification()
        spec.name = name

        # Declare every variable that appears in the formula as a float.
        # We extract identifiers that look like signal names (word chars only,
        # not pure numbers, not STL keywords).
        _STL_KEYWORDS = {
            "always", "eventually", "until", "since", "implies",
            "not", "and", "or", "true", "false",
        }
        import re
        tokens = set(re.findall(r"\b([A-Za-z_][A-Za-z0-9_]*)\b", formula))
        signals_in_formula = tokens - _STL_KEYWORDS
        for var in signals_in_formula:
            try:
                spec.declare_var(var, "float")
            except Exception:
                pass  # already declared or keyword

        spec.spec = formula
        try:
            spec.parse()
            spec.pastify()
        except rtamt.RTAMTException as err:
            print(f"[SpecManager] RTAMT error for '{name}': {err}")
            return

        self._specs[name] = spec
        self._formulas[name] = formula

    # ------------------------------------------------------------------
    def evaluate(self, signal_name: str, value: float, timestamp_ms: float) -> None:
        """
        Feed a new (timestamp, value) pair for *signal_name* into every spec
        that references it, then POST the robustness result to Flask.

        timestamp_ms – milliseconds since monitoring start (as produced by the
                        generated code: `time.time() * 1000`).
        """
        if value is None:
            return

        for spec_name, spec in list(self._specs.items()):
            formula = self._formulas[spec_name]
            # Only evaluate specs that reference this signal
            if signal_name not in formula:
                continue
            try:
                result = spec.update([signal_name, [(timestamp_ms, value)]])
                if result:
                    payload = json.dumps({
                        "spec": spec_name,
                        "result": result,
                        "formula": formula,
                    })
                    try:
                        requests.post(f"{FLASK_URL}/push", data=payload, timeout=2)
                    except requests.RequestException as exc:
                        print(f"[SpecManager] Could not reach Flask: {exc}")
            except Exception as exc:
                print(f"[SpecManager] Evaluation error for '{spec_name}': {exc}")
