# auth-access-service

Authentication and authorization backend service built with **Java 21** and **Spring Boot 3**, focused on clean architecture, security, testing, and professional engineering practices.

## Overview

`auth-access-service` is a portfolio project designed with a real-world engineering mindset.  
Its goal is to demonstrate the ability to build a production-style backend service with:

- secure authentication
- role-based authorization (RBAC)
- token lifecycle management
- audit trail
- API documentation
- automated tests
- professional repository and Git workflow organization

This project is meant to showcase backend skills valued by enterprise teams, financial institutions, internal platforms, and systems that require security and traceability.

## Project goals

- Implement user registration and login
- Issue JWT access token and refresh token
- Protect routes with Spring Security
- Control access by role
- Register authentication-sensitive events
- Keep API contracts clear and testable
- Structure the repository with professional standards

## MVP scope

- User registration
- Login
- JWT access token
- Refresh token
- Logout/revocation
- RBAC with initial roles (`USER`, `ADMIN`)
- Protected endpoints
- Basic audit trail
- OpenAPI/Swagger
- Unit and integration tests
- Docker Compose for local environment
- CI with GitHub Actions

## Tech stack

- Java 21
- Spring Boot 3
- Spring Security
- Spring Data JPA
- PostgreSQL
- Redis
- Testcontainers
- JUnit 5
- Mockito
- Docker
- OpenAPI / Swagger
- GitHub Actions

## Architecture

The project follows a **modular monolith with pragmatic clean architecture**, prioritizing clarity, separation of concerns, and testability without overengineering.

### Layers

- `domain`  
  Core business rules, entities, and contracts

- `application`  
  Use cases, orchestration, and application rules

- `infrastructure`  
  Persistence, security, integrations, and technical implementations

- `interfaces/http`  
  Controllers, DTOs, input validation, and HTTP concerns

## Planned structure

```text
src/main/java/com/lucasgomes/authaccessservice
├── domain
├── application
├── infrastructure
└── interfaces
    └── http
```

### Technical decisions

#### JWT + Refresh Token

The project will use short-lived access tokens and persisted/revocable refresh tokens to model a realistic authentication flow.

#### Simple and evolvable RBAC

The initial authorization model will be role-based in order to keep the MVP simple while allowing future evolution.

#### PostgreSQL + Redis

PostgreSQL will be the primary persistence layer.  
Redis will support token/session-related flows and expiration control as the project evolves.

#### Testing from the beginning

The project will include practical unit and integration test coverage, using Testcontainers for relevant scenarios.

## Roadmap

### M1 Foundation
- initial project structure
- documentation
- local setup
- Docker Compose
- base configuration
- OpenAPI
- initial pipeline

### M2 Authentication Core
- registration
- login
- JWT
- refresh token
- validations
- password hashing

### M3 Authorization and Security
- RBAC
- protected routes
- access rules
- logout/revocation
- basic hardening

### M4 Production Readiness
- audit trail
- robust integration tests
- documentation improvements
- observability refinements
- final project release

## Running locally

*In progress. Detailed setup instructions will be updated as the technical foundation is implemented.*

### Expected prerequisites
- Java 21
- Docker and Docker Compose
- Git

### General steps
1. Clone the repository
2. Start local dependencies with Docker Compose
3. Configure environment variables
4. Run the Spring Boot application

### Environment variables

An example file will be added soon:

`.env.example`

### API documentation

The API documentation will be available through Swagger/OpenAPI after the initial setup is complete.

**Expected path:**

- `/swagger-ui/index.html`

### Quality and testing

The project aims to maintain:

- unit tests for services and rules
- integration tests for critical flows
- reproducible build
- commit and PR conventions
- minimum documentation per milestone

### Development workflow

- `main` → stable branch
- `develop` → integration branch
- work branches by issue:
  - `feat/{issue-id}-{slug}`
  - `fix/{issue-id}-{slug}`
  - `chore/{issue-id}-{slug}`
  - `docs/{issue-id}-{slug}`

### Conventions

#### Commits

This repository uses [Conventional Commits](https://www.conventionalcommits.org).

**Examples:**
- `feat(auth): implement login endpoint`
- `fix(security): validate expired refresh token`
- `docs(readme): improve architecture overview`

#### Pull Requests
- small PRs
- clear scope
- linked to an issue
- with validation checklist
- preferably targeting `develop`

## Contributing

See the [CONTRIBUTING.md](CONTRIBUTING.md) file.

## Changelog

See the [CHANGELOG.md](CHANGELOG.md) file.

## License

This project is licensed under the [MIT license](LICENSE).

## Contact

**Lucas Gomes de Oliveira**

- LinkedIn: *add link*
- GitHub: *add link*
- Email: lucasgomescomp@hotmail.com

