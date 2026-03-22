#!/bin/sh
# entrypoint.sh
# Watches $WORKDIR/monitor.py for changes and (re)runs it.
# This way the Flask container just writes the file; this container picks it up.

MONITOR_SCRIPT="${WORKDIR}/monitor.py"
CURRENT_PID=""
LAST_MTIME=""

echo "[monitor] Waiting for ${MONITOR_SCRIPT} ..."

while true; do
    if [ -f "$MONITOR_SCRIPT" ]; then
        MTIME=$(stat -c "%Y" "$MONITOR_SCRIPT" 2>/dev/null)

        if [ "$MTIME" != "$LAST_MTIME" ]; then
            echo "[monitor] Detected new/updated monitor.py (mtime=${MTIME})"

            # Kill previous instance if running
            if [ -n "$CURRENT_PID" ] && kill -0 "$CURRENT_PID" 2>/dev/null; then
                echo "[monitor] Stopping previous monitor (pid=$CURRENT_PID)"
                kill "$CURRENT_PID"
                wait "$CURRENT_PID" 2>/dev/null
            fi

            # Start new instance
            cd "$WORKDIR" || exit 1
            python monitor.py &
            CURRENT_PID=$!
            LAST_MTIME="$MTIME"
            echo "[monitor] Started monitor.py (pid=$CURRENT_PID)"
        fi
    fi

    sleep 2
done
