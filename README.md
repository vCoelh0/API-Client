# CRUD Clientes

Projeto feito com o objetivo de praticar as habilidades de Java e Spring Boot.

O Projeto foi feito utiliando a linguagem Java com o framework Spring Boot. Nele contem um CRUD completo de web services REST para acessar um recurso de clientes.
O gerenciador de dependencias utilizado foi o Maven e foi feito em ambiente de testes acessando o banco de dados H2.

Funcionalidades do projeto:

- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso


CHECKLIST:
1. Busca por id retorna cliente existente
2. Busca por id retorna 404 para cliente inexistente
3. Busca paginada retorna listagem paginada corretamente
4. Inserção de cliente insere cliente com dados válidos
5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos
6. Atualização de cliente atualiza cliente com dados válidos
7. Atualização de cliente retorna 404 para cliente inexistente
8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos
9. Deleção de cliente deleta cliente existente
10. Deleção de cliente retorna 404 para cliente inexistente
