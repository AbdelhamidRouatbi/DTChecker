import os
import queue
import subprocess
import sys
import threading

from flask import Flask, Response, request
from flask_cors import CORS

app = Flask(__name__)
CORS(app)

message_queue = queue.Queue()

# Directory where monitor.py and specs.py live (shared volume with monitor container)
WORKDIR = os.environ.get("WORKDIR", "/app/workdir")

# Path to the Python executable inside the container
PYTHON_BIN = os.environ.get("PYTHON_BIN", sys.executable)

# Currently running monitor process (if any)
_monitor_proc = None
_monitor_lock = threading.Lock()


@app.route("/generate", methods=["POST"])
def generate():
    """Receive the generated monitor script, write it to disk, and (re)start it."""
    global _monitor_proc

    script_content = request.data.decode("utf-8").replace("\r", "")
    monitor_path = os.path.join(WORKDIR, "monitor.py")

    os.makedirs(WORKDIR, exist_ok=True)
    with open(monitor_path, "w") as f:
        f.write(script_content)

    with _monitor_lock:
        # Kill any previously running monitor
        if _monitor_proc and _monitor_proc.poll() is None:
            _monitor_proc.terminate()
            try:
                _monitor_proc.wait(timeout=5)
            except subprocess.TimeoutExpired:
                _monitor_proc.kill()

        try:
            _monitor_proc = subprocess.Popen(
                [PYTHON_BIN, monitor_path],
                cwd=WORKDIR,
            )
            return "Verifier started successfully", 200
        except Exception as exc:
            app.logger.error("Error starting verifier: %s", exc)
            return str(exc), 500


@app.route("/stream")
def stream():
    """Server-Sent Events endpoint — pushes robustness results to the browser."""

    def event_stream():
        while True:
            result = message_queue.get()
            app.logger.debug("Sending to front-end: %s", result)
            yield f"data: {result}\n\n"

    return Response(event_stream(), mimetype="text/event-stream")


@app.route("/push", methods=["POST"])
def push():
    """The running monitor script calls this to post a robustness result."""
    data = request.data.decode("utf-8")
    app.logger.debug("Received from verifier: %s", data)
    message_queue.put(data)
    return "Pushed to queue", 200


if __name__ == "__main__":
    app.run(host="0.0.0.0", port=int(os.environ.get("PORT", 5000)),
            debug=False, threaded=True)
