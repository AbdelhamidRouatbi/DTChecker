# DTChecker — Docker Setup

## Architecture

Four containers, orchestrated by Docker Compose:

```
┌─────────────────────────────────────────────────────────────┐
│  Browser                                                     │
│    └── :8090  Xtext/Jetty  (DSL editor + code generation)   │
│    └── :5000  Flask        (backend API + SSE stream)        │
└─────────────────────────────────────────────────────────────┘
         │                        │
         │                        │ /generate  /push  /stream
         ▼                        ▼
   ┌──────────┐           ┌──────────────┐
   │ RabbitMQ │◄──────────│   Monitor    │
   │  :5672   │  AMQP     │  (runner)    │
   └──────────┘           └──────────────┘
        ▲
        │  sensor data
   Physical Twin / DT
```

| Container          | Port  | Description                                      |
|--------------------|-------|--------------------------------------------------|
| `dtchecker-rabbitmq` | 5672 / 15672 | RabbitMQ message broker              |
| `dtchecker-xtext`  | 8090  | Jetty server hosting the Xtext DSL editor        |
| `dtchecker-flask`  | 5000  | Flask API: receives generated scripts, SSE stream |
| `dtchecker-monitor` | —    | Watches for new `monitor.py` and runs it         |

## Prerequisites

- Docker ≥ 24 with **Docker Desktop** (Windows)
- Docker Compose v2 (`docker compose` — note: no hyphen)

## Quick Start

```bash
# From the project root (where docker-compose.yml lives)
docker compose up --build
```

Then open **http://localhost:8090** in your browser.

The Flask backend is available at **http://localhost:5000**.  
The RabbitMQ management UI is at **http://localhost:15672** (user: `incubator`, pass: `incubator`).

## How it works end-to-end

1. You write specifications in the DSL editor at `:8090`.
2. Clicking **Monitor** triggers Xtext code generation, which produces a Python monitoring script.
3. The script is POSTed to Flask's `/generate` endpoint.
4. Flask writes `monitor.py` to a shared volume (`monitor_workdir`).
5. The `monitor` container detects the new file and runs it.
6. The script connects to RabbitMQ, reads sensor queues, evaluates STL formulas via RTAMT, and POSTs robustness results to Flask's `/push`.
7. Flask pushes results over SSE (`/stream`) back to the browser dashboard.

## Configuration

All configuration is via environment variables in `docker-compose.yml`:

| Variable          | Default              | Description                          |
|-------------------|----------------------|--------------------------------------|
| `RABBITMQ_HOST`   | `rabbitmq`           | RabbitMQ hostname                    |
| `RABBITMQ_USER`   | `incubator`          | RabbitMQ username                    |
| `RABBITMQ_PASS`   | `incubator`          | RabbitMQ password                    |
| `FLASK_URL`       | `http://flask:5000`  | Flask backend URL (used by monitor)  |
| `XTEXT_HOST`      | `0.0.0.0`            | Bind address for Jetty               |
| `XTEXT_PORT`      | `8090`               | Jetty port                           |
| `WORKDIR`         | `/app/workdir`       | Shared volume path for monitor.py    |

## Connecting your own Digital Twin

Point your DT's RabbitMQ publisher at `localhost:5672` with credentials `incubator/incubator`. DTChecker will pick up any queue declared in your DSL specification.

To use a different RabbitMQ instance entirely, update `RABBITMQ_HOST`, `RABBITMQ_USER`, and `RABBITMQ_PASS` in `docker-compose.yml`.

## Stopping

```bash
docker compose down
```

To also remove the shared volume:

```bash
docker compose down -v
```

## File layout

```
dtchecker-docker/
├── docker-compose.yml
├── docker/
│   ├── xtext/
│   │   └── Dockerfile          # Maven build → Jetty runtime
│   ├── flask/
│   │   └── Dockerfile          # Flask API server
│   └── monitor/
│       ├── Dockerfile          # Monitor runner
│       └── entrypoint.sh       # Watches shared volume, restarts monitor.py
├── eclipse/                    # Xtext/Xtend source (DSL + code generator)
│   └── org.xtext.stlrobust.spec.parent/
└── python/
    ├── requirements.txt
    ├── specs.py                # SpecManager — imported by generated monitor.py
    └── backend/
        └── app.py              # Flask application
```
https://bentleyjoakes.github.io/assets/publications/Rouatbi2025%20-%20DTChecker%20A%20Real-Time%20Signal%20Monitoring%20and%20Property%20Specification%20Tool%20for%20Digital%20Twins.pdf
## License

This project is licensed under the 
[Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License](https://creativecommons.org/licenses/by-nc-sa/4.0/).
