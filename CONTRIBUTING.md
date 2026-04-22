# Contribuindo

Obrigado por dedicar tempo para contribuir com este projeto.

Mesmo sendo um projeto de portfólio com execução principal individual, este repositório segue práticas próximas de um time real de engenharia para reforçar organização, rastreabilidade e disciplina de desenvolvimento.

## Fluxo de trabalho

Toda mudança relevante deve seguir este fluxo:

1. Criar ou identificar uma **issue**
2. Refinar objetivo e critérios de aceite
3. Criar uma **branch** a partir de `develop`
4. Implementar a mudança com escopo controlado
5. Abrir **Pull Request** para `develop`
6. Revisar checklist de qualidade
7. Fazer **merge**
8. Atualizar documentação quando necessário

## Branches

### Branches principais

- `main`: branch estável
- `develop`: branch de integração

### Branches de trabalho

Use sempre o identificador da **issue** no nome da branch.

**Padrões:**
- `feat/{issue-id}-{slug}`
- `fix/{issue-id}-{slug}`
- `chore/{issue-id}-{slug}`
- `docs/{issue-id}-{slug}`
- `test/{issue-id}-{slug}`
- `refactor/{issue-id}-{slug}`

**Exemplos:**
- `feat/12-register-endpoint`
- `fix/18-invalid-refresh-token`
- `docs/2-repository-documentation`

## Commits

Este projeto utiliza **[Conventional Commits](https://www.conventionalcommits.org/)**.

**Exemplos:**
- `feat(auth): implement register endpoint`
- `fix(security): reject expired refresh token`
- `docs(readme): improve setup section`
- `test(auth): add login use case tests`

## Pull Requests

Todo **Pull Request** deve:

- ter escopo pequeno e objetivo
- estar vinculado a uma **issue**
- explicar claramente o que foi alterado
- informar como validar
- atualizar documentação quando necessário
- preferencialmente fechar a **issue** com `Closes #ID`

## Checklist antes de abrir PR

- [ ] existe **issue** relacionada
- [ ] **branch** segue o padrão do projeto
- [ ] código está consistente com a arquitetura
- [ ] não introduz complexidade desnecessária
- [ ] testes aplicáveis foram adicionados/ajustados
- [ ] documentação foi atualizada quando necessário
- [ ] **build** local executa com sucesso

## Padrões de qualidade

Ao contribuir, priorize:

- clareza
- nomes consistentes
- separação de responsabilidades
- simplicidade
- testabilidade
- **segurança por padrão**

**Evite:**
- overengineering
- classes genéricas demais
- lógica de negócio espalhada em **controller**
- acoplamento desnecessário
- alterações grandes sem justificativa

## Issues

As **issues** devem conter, sempre que possível:

- objetivo
- escopo
- critérios de aceite
- impacto esperado
- área do sistema
- prioridade

## Documentação

Atualize a documentação quando a mudança afetar:

- **setup**
- arquitetura
- comportamento da **API**
- variáveis de ambiente
- fluxo de autenticação/autorização

## Código de conduta

Ao interagir neste repositório, mantenha comunicação **respeitosa, clara e profissional**.

