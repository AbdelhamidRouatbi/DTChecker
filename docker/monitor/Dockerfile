FROM python:3.12-slim

WORKDIR /app

# dos2unix ensures entrypoint.sh works even if the repo was checked out on
# Windows and the file has CRLF line endings.
RUN apt-get update && apt-get install -y --no-install-recommends dos2unix \
    && rm -rf /var/lib/apt/lists/*

# Install dependencies (same as Flask — monitor scripts need pika, rtamt, requests)
COPY python/requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# specs.py is also needed here; it lives on the shared volume at runtime,
# but we bake a copy in as a fallback.
COPY python/specs.py ./specs.py

# entrypoint.sh watches the shared volume for a new monitor.py and runs it
COPY docker/monitor/entrypoint.sh /entrypoint.sh
RUN dos2unix /entrypoint.sh && chmod +x /entrypoint.sh

ENV WORKDIR=/app/workdir \
    FLASK_URL=http://flask:5000 \
    RABBITMQ_HOST=rabbitmq \
    RABBITMQ_USER=incubator \
    RABBITMQ_PASS=incubator

ENTRYPOINT ["/entrypoint.sh"]
