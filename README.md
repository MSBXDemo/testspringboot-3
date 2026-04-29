# test-springboot-3

test-springboot-3

## Stack

| Property | Value |
|----------|-------|
| **Framework** | Spring Boot 3.x |
| **Java** | 21 |
| **Cloud** | AWS |
| **Cost Center** | `MC-1234` |
| **Owner** | group:default/msbx-engineering |

## Quick Start

```bash
# Build
mvn package

# Run locally
mvn spring-boot:run

# Docker
docker build -t test-springboot-3 .
docker run -p 8080:8080 test-springboot-3
```

## API

| Method | Path | Description |
|--------|------|-------------|
| GET | `/api/v1/hello` | Health check |
| GET | `/actuator/health` | Actuator health |
| GET | `/actuator/metrics` | Metrics endpoint |
