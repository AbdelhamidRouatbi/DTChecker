# Making Changes to DTChecker

After any change, rebuild with:
```
docker compose up --build
```

All file types rebuild correctly inside Docker with no extra steps needed.

## What changes are automatically handled

| What you changed | Extra step needed |
|---|---|
| `python/backend/app.py` | None |
| `python/specs.py` | None |
| `python/requirements.txt` | None |
| Web module Java (`src/`, `src-gen/`) | None |
| `.xtend` generator files | None — Xtend runs inside Docker |
| `WebRoot/` frontend assets | None |

## The one exception: DSL grammar changes

If you edit `Spec.xtext` (the grammar definition), the `src-gen/` folder needs
to be regenerated. This requires Eclipse:

1. Open Eclipse
2. Right-click `GenerateSpec.mwe2` → **Run As → MWE2 Workflow**
3. This regenerates `src-gen/` (parser, EMF model classes, etc.)
4. Commit the updated `src-gen/` files
5. Then run `docker compose up --build`

Everything else — including `.xtend` file edits — rebuilds automatically.
