# Prompts — LTI ATS (scaffolding)

Este archivo recoge el **prompt principal** utilizado para generar la estructura inicial del proyecto (backend, frontend, base de datos y Docker). Está inspirado en una plantilla de testing de otro stack (Node/Express/Jest); aquí se adaptó al stack real del ejercicio.

---

## Prompt: scaffolding full stack (Kotlin + Spring Boot + React + PostgreSQL + Docker)

```text
ROLE
You are an expert fullstack developer specialized in Kotlin/Spring Boot backends and React/TypeScript frontends, with strong experience in Docker containerization.

CONTEXT
You are setting up the initial scaffolding for an Applicant Tracking System (ATS) for a company called LTI. The project must have frontend, backend, and database layers, all runnable with a single command. No CRUD functionality is needed yet — only the base structure that compiles and starts correctly.

OBJECTIVE
Create the complete project scaffolding with the structure, configuration, and Docker setup so that docker-compose up --build starts everything without errors.

TECH STACK
Backend: Kotlin + Spring Boot 3.2+ + Gradle (Kotlin DSL) + Spring Data JPA + PostgreSQL Driver
Frontend: React 18 + Vite 5 + TypeScript + Tailwind CSS 3
Database: PostgreSQL 16
Infrastructure: Docker + Docker Compose

PROJECT STRUCTURE
/
├── backend/          # Kotlin + Spring Boot
├── frontend/         # React + Vite + TypeScript
├── docker-compose.yml
└── README.md

SPECIFIC REQUIREMENTS
Backend (backend/)
✅ Spring Boot 3.2+ with Kotlin, Gradle Kotlin DSL (build.gradle.kts)
✅ Dependencies: Spring Web, Spring Data JPA, PostgreSQL Driver, Spring Boot DevTools
✅ application.yml connecting to PostgreSQL (host: postgres, port: 5432, db: lti_ats, user: lti, password: lti_password)
✅ JPA entities (classes only, no repositories or services yet):
Candidate (id, firstName, lastName, email, phone, address, education, workExperience, createdAt, updatedAt)
JobPosition (id, title, description, status, department, location, salaryMin, salaryMax, createdAt, updatedAt)
Application (id, candidateId, jobPositionId, status, applicationDate, notes, createdAt, updatedAt)
Interview (id, applicationId, interviewDate, interviewType, location, interviewer, notes, score, createdAt, updatedAt)
✅ Health check controller: GET /api/health → {"status": "UP", "application": "LTI ATS"}
✅ spring.jpa.hibernate.ddl-auto=update
✅ Multi-stage Dockerfile: build with Gradle, run with Eclipse Temurin JDK 21

Frontend (frontend/)
✅ React 18 + Vite 5 + TypeScript + Tailwind CSS 3
✅ App.tsx with header "LTI - Applicant Tracking System" and 4 placeholder dashboard cards: Candidates, Job Positions, Applications, Interviews
✅ Proxy in vite.config.ts: /api/* → http://localhost:8080 (dev mode)
✅ Multi-stage Dockerfile: build with Node 20, serve with nginx
✅ nginx.conf serving the SPA and proxying /api to the backend

Docker Compose (docker-compose.yml)
✅ 3 services: postgres, backend, frontend
✅ PostgreSQL 16 with persistent volume
✅ Backend depends on postgres (with healthcheck)
✅ Frontend depends on backend
✅ Ports: frontend → 3000, backend → 8080

README.md
✅ Project name and brief ATS description
✅ Tech stack table
✅ Instructions to run with docker-compose up --build
✅ Instructions for local development (backend and frontend separately)

CRITICAL CONSTRAINTS
⚠️ All dependency versions MUST be compatible with each other
⚠️ The project MUST compile and start without errors using docker-compose up --build
⚠️ Do NOT implement any CRUD functionality — only scaffolding
```

---

## Por qué esta estructura de prompt

| Elemento | Utilidad |
|----------|----------|
| **ROLE / CONTEXT / OBJECTIVE** | Delimita rol, situación y resultado esperado. |
| **Requisitos con checkmarks** | Reduce ambigüedad. |
| **Stack y estructura de carpetas** | Evita mezclar tecnologías de otros ejercicios. |
| **Restricciones finales** | Refuerza alcance (solo scaffolding, sin CRUD). |

---

## Versiones concretas en el repo

En la implementación se fijaron versiones compatibles (por ejemplo Spring Boot 3.5.x, Vite 5.x). Si regeneras código con IA, revisa que sigan alineadas con el enunciado del módulo.
