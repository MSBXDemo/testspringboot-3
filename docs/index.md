# test-springboot-3

test-springboot-3

## Service Overview

This microservice was scaffolded using the **Spring Boot Microservice** golden path template in the MSBX Developer Portal.

## Governance

| Property | Value |
|---|---|
| Cost Center | MC-1234 |
| Target Cloud | aws |
| Budget Cap | USD 2000/month |
| Owner | group:default/msbx-engineering |

## Architecture

Built on Spring Boot 3.x with Java 21. Includes:
- REST endpoints with Actuator health/metrics
- Multi-stage Dockerfile (non-root user)
- GitHub Actions CI with Trivy security scanning
