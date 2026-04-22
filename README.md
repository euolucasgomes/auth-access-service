# auth-access-service

Serviço backend de autenticação e autorização construído com **Java 21** e **Spring Boot 3**, com foco em arquitetura limpa, segurança, testes e boas práticas de engenharia.

## Visão geral

O `auth-access-service` é um projeto de portfólio com abordagem próxima de um ambiente real de engenharia.  
O objetivo é demonstrar capacidade de construir um backend corporativo com:

- autenticação segura
- autorização baseada em papéis (RBAC)
- ciclo de vida de tokens
- trilha de auditoria
- documentação de API
- testes automatizados
- organização de repositório e fluxo Git profissional

Este projeto foi desenhado para reforçar competências valorizadas em times backend que trabalham com sistemas internos, produtos corporativos, instituições financeiras e ambientes com requisitos de segurança e rastreabilidade.

## Objetivos do projeto

- Implementar registro e login de usuários
- Emitir access token JWT e refresh token
- Proteger rotas com Spring Security
- Controlar acesso por role
- Registrar eventos sensíveis de autenticação
- Manter contratos de API claros e testáveis
- Estruturar o repositório com padrão profissional

## Escopo do MVP

- Cadastro de usuário
- Login
- JWT access token
- Refresh token
- Logout/revogação
- RBAC com papéis iniciais (`USER`, `ADMIN`)
- Endpoints protegidos
- Auditoria básica
- OpenAPI/Swagger
- Testes unitários e de integração
- Docker Compose para ambiente local
- CI com GitHub Actions

## Stack

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

## Arquitetura

O projeto segue uma abordagem de **modular monolith com clean architecture pragmática**, priorizando clareza, separação de responsabilidades e testabilidade sem overengineering.

### Camadas

- **`domain`**  
  Regras centrais de negócio, entidades e contratos

- **`application`**  
  Casos de uso, orquestração e regras de aplicação

- **`infrastructure`**  
  Persistência, segurança, integrações e implementações técnicas

- **`interfaces/http`**  
  Controllers, DTOs, validações de entrada e tratamento HTTP

## Estrutura planejada

```text
src/main/java/com/lucasgomes/authaccessservice
├── domain
├── application
├── infrastructure
└── interfaces
    └── http
```

### Principais decisões técnicas

#### JWT + Refresh Token

O projeto utilizará access token de curta duração e refresh token com controle de persistência/revogação para representar um fluxo realista de autenticação.

#### RBAC simples e evolutivo

A autorização inicial será baseada em roles para manter simplicidade no MVP e permitir evolução futura sem complicar o design prematuramente.

#### PostgreSQL + Redis

O PostgreSQL será usado como fonte principal de persistência.  
O Redis será utilizado para apoiar fluxos de token, sessão e controle de expiração conforme a evolução do projeto.

#### Testes desde a base

O projeto será construído com cobertura prática de testes unitários e de integração, com uso de Testcontainers para cenários relevantes.

## Roadmap

### M1 Foundation
- estrutura inicial do projeto
- documentação
- setup local
- Docker Compose
- configuração base
- OpenAPI
- pipeline inicial

### M2 Authentication Core
- registro
- login
- JWT
- refresh token
- validações
- hashing de senha

### M3 Authorization and Security
- RBAC
- rotas protegidas
- regras de acesso
- logout/revogação
- hardening básico

### M4 Production Readiness
- auditoria
- testes de integração robustos
- melhoria de documentação
- ajustes finais de observabilidade
- release final do projeto

## Como rodar localmente

*Em construção. O setup detalhado será atualizado conforme a base técnica do projeto for implementada.*

### Pré-requisitos esperados
- Java 21
- Docker e Docker Compose
- Git

### Passos gerais
1. Clonar o repositório
2. Subir dependências locais com Docker Compose
3. Configurar variáveis de ambiente
4. Executar a aplicação Spring Boot

### Variáveis de ambiente

Um arquivo de exemplo será adicionado em breve:

`.env.example`

### Documentação da API

A documentação da API será disponibilizada via Swagger/OpenAPI após a configuração inicial do projeto.

Exemplo esperado:

- `/swagger-ui/index.html`

### Qualidade e testes

O projeto buscará manter:

- testes unitários para regras e serviços
- testes de integração para fluxos críticos
- build reproduzível
- convenções de commit e PR
- documentação mínima por milestone

### Fluxo de desenvolvimento

- `main` → branch estável
- `develop` → branch de integração
- branches de trabalho por issue:
  - `feat/{issue-id}-{slug}`
  - `fix/{issue-id}-{slug}`
  - `chore/{issue-id}-{slug}`
  - `docs/{issue-id}-{slug}`

### Convenções

#### Commits

Este repositório usa [Conventional Commits](https://www.conventionalcommits.org).

**Exemplos:**
- `feat(auth): implement login endpoint`
- `fix(security): validate expired refresh token`
- `docs(readme): improve architecture overview`

#### Pull Requests
- PRs pequenos
- escopo claro
- vinculados a issue
- com checklist de validação
- preferencialmente para `develop`

## Contribuição

Veja o arquivo [CONTRIBUTING.md](CONTRIBUTING.md).

## Changelog

Veja o arquivo [CHANGELOG.md](CHANGELOG.md).

## Licença

Este projeto está sob a [licença MIT](LICENSE).

## Contato

**Lucas Gomes de Oliveira**

- LinkedIn: https://www.linkedin.com/in/euolucasgomes/
- GitHub: https://github.com/euolucasgomes/
- Email: lucasgomescomp@hotmail.com

