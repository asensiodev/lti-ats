# LTI - Applicant Tracking System

Applicant Tracking System (ATS) scaffolding for **LTI**: backend API, web UI, and PostgreSQL, runnable together with Docker Compose. This repository contains structure and configuration only—no CRUD features yet.

## Tech stack

| Layer | Technology |
|-------|------------|
| **Backend** | Kotlin, Spring Boot 3.5+, Gradle (Kotlin DSL), Spring Data JPA, PostgreSQL driver |
| **Frontend** | React 18, Vite 5, TypeScript, Tailwind CSS 3 |
| **Database** | PostgreSQL 16 |
| **Infrastructure** | Docker, Docker Compose |

## Run everything (Docker)

From the repository root:

```bash
docker compose up --build
```

- **Frontend:** [http://localhost:3000](http://localhost:3000) (nginx serves the SPA and proxies `/api` to the backend)
- **Backend:** [http://localhost:8080](http://localhost:8080)
- **Health:** [http://localhost:8080/api/health](http://localhost:8080/api/health) or via the frontend at [http://localhost:3000/api/health](http://localhost:3000/api/health)

PostgreSQL is available inside the Compose network as `postgres:5432` (database `lti_ats`, user `lti`).

## Local development (without Docker for app containers)

### Database

Start PostgreSQL 16 locally and create database `lti_ats` with user/password matching `backend/src/main/resources/application.yml`, or override:

```bash
export SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/lti_ats
export SPRING_DATASOURCE_USERNAME=lti
export SPRING_DATASOURCE_PASSWORD=lti_password
```

### Backend

```bash
cd backend
./gradlew bootRun
```

### Frontend

```bash
cd frontend
npm install
npm run dev
```

Vite proxies `/api/*` to `http://localhost:8080` during development.

## Project layout

```
/
├── backend/           # Spring Boot + Kotlin
├── frontend/          # React + Vite + TypeScript
├── docker-compose.yml
└── README.md
```
