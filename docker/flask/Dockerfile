FROM python:3.12-slim

WORKDIR /app

# Install dependencies
COPY python/requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy application source
COPY python/backend/app.py ./backend/app.py
# specs.py must be present in WORKDIR at runtime so generated monitor.py can import it
COPY python/specs.py ./workdir/specs.py

EXPOSE 5000

ENV WORKDIR=/app/workdir \
    FLASK_URL=http://flask:5000

CMD ["python", "backend/app.py"]
