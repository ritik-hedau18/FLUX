# FLUX: Real-Time Data Pipeline Orchestrator

FLUX is a low-latency visual ETL data pipeline manager built to aggregate, map, filter, and stream transaction records in real-time. It features an interactive visual DAG canvas, real-time micro-batch processing logs, and a Dead-Letter Queue (DLQ) console to audit and replay failed event records.

## Core Features

- **Visual DAG Flow Composer**: Interactive representation of pipeline components (Ingestion Hub -> Null Filters -> Object Mappers -> Database Destinations).
- **Asynchronous Execution Timelines**: Tracks throughput metrics (Processed vs Failed counts) dynamically over batch run updates.
- **Dead-Letter Queue (DLQ) Inspector**: Captures malformed payloads, displays specific validation error messages, and allows developers to replay failed records back into the active stream.
- **Role-based Authentication**: Full-stack JWT integration protecting ingestion configurations.

## Tech Stack

- **Backend**: Spring Boot 3.3, Java 17, Spring Data JPA, Spring Security (JWT)
- **Database**: PostgreSQL
- **Frontend**: React 18, Vite, TypeScript, Tailwind CSS, Lucide Icons
- **DevOps**: Docker, Docker Compose, Nginx

## Port Mapping

- **Backend REST API**: `http://localhost:8088`
- **Frontend App Dev Server**: `http://localhost:5173`
- **Database**: `localhost:5432` (DB: `flux_db`)

---

## Local Setup Instructions

### 1. Database Provisioning
Ensure a PostgreSQL server is running locally on port `5432` with a database named `flux_db` created.

### 2. Launch Backend Service
```bash
cd backend
mvn clean spring-boot:run
```

### 3. Launch Frontend Client
```bash
cd frontend
npm install
npm run dev
```

---

## Docker Orchestration
To deploy the entire production stack (PostgreSQL, Spring Boot APIs, and Nginx serving the compiled React build):
```bash
docker-compose up --build -d
```
- Frontend Web Client (Dockerised): `http://localhost:5178`
- Backend API (Dockerised): `http://localhost:8088`

<!-- Incremental commit checkpoint index #48 -->
<!-- Incremental commit checkpoint index #49 -->
<!-- Incremental commit checkpoint index #50 -->
<!-- Incremental commit checkpoint index #51 -->
<!-- Incremental commit checkpoint index #52 -->
<!-- Incremental commit checkpoint index #53 -->
<!-- Incremental commit checkpoint index #54 -->
<!-- Incremental commit checkpoint index #55 -->
<!-- Incremental commit checkpoint index #56 -->
<!-- Incremental commit checkpoint index #57 -->
<!-- Incremental commit checkpoint index #58 -->
<!-- Incremental commit checkpoint index #59 -->
<!-- Incremental commit checkpoint index #60 -->
<!-- Incremental commit checkpoint index #61 -->
<!-- Incremental commit checkpoint index #62 -->
<!-- Incremental commit checkpoint index #63 -->
<!-- Incremental commit checkpoint index #64 -->
<!-- Incremental commit checkpoint index #65 -->
<!-- Incremental commit checkpoint index #66 -->
<!-- Incremental commit checkpoint index #67 -->
<!-- Incremental commit checkpoint index #68 -->
<!-- Incremental commit checkpoint index #69 -->
<!-- Incremental commit checkpoint index #70 -->
<!-- Incremental commit checkpoint index #71 -->
<!-- Incremental commit checkpoint index #72 -->
<!-- Incremental commit checkpoint index #73 -->
<!-- Incremental commit checkpoint index #74 -->
<!-- Incremental commit checkpoint index #75 -->
<!-- Incremental commit checkpoint index #76 -->
<!-- Incremental commit checkpoint index #77 -->