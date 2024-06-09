Veículo API

- Descrição
A Veículo API é um serviço RESTful desenvolvido em Spring Boot para gerenciar informações de veículos. Ele permite a criação, leitura, atualização e exclusão (CRUD) de registros de veículos em um banco de dados.

- Funcionalidades
• Listar Veículos: Recupera uma lista de todos os veículos cadastrados.
• Detalhar Veículo: Recupera os detalhes de um veículo específico pelo ID.
• Adicionar Veículo: Adiciona um novo veículo ao banco de dados.
• Atualizar Veículo: Atualiza as informações de um veículo existente.
• Remover Veículo: Remove um veículo do banco de dados.

- Tecnologias Utilizadas
• Java 8+;
• Spring Boot;
• Maven;
• MySQL;
• JPA/Hibernate;

- Estrutura do Projeto
O projeto está organizado conforme a estrutura padrão do Spring Boot, com pacotes para controladores, serviços, repositórios e modelos de dados.

src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── desafio_place
│   │               ├── controller
│   │               ├── model
│   │               ├── repository
│   │               └── service
│   └── resources
└── test
    └── java

- Instruções Detalhadas de Configuração e Uso
1. Clonar o Repositório

git clone https://github.com/CarlaMmp/Desafio3
cd Desafio3

2. Configurar o Banco de Dados
Crie um banco de dados no MySQL (ou outro banco de dados configurado) e configure as credenciais no arquivo application.properties.

# src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3. Construir o Projeto
Utilize Maven para construir o projeto:

mvn clean install

4. Executar o Aplicativo
Após construir o projeto, você pode executar a aplicação com o comando Maven Spring Boot:

mvn spring-boot:run

A aplicação estará disponível em http://localhost:8080.

- Endpoints da API
  Listar Todos os Veículos
• URL: /api/veiculos;
• Método HTTP: GET;
• Resposta de Sucesso: 200 OK;

  Obter Veículo pelo ID
• URL: /api/veiculos/{id};
• Método HTTP: GET;
• Resposta de Sucesso: 200 OK;
• Resposta de Falha: 404 Not Found;

  Criar Novo Veículo
• URL: /api/veiculos;
• Método HTTP: POST;
• Corpo da Requisição: application/json;
• Resposta de Sucesso: 201 Created;

  Atualizar Veículo Existente
• URL: /api/veiculos/{id};
• Método HTTP: PUT;
• Corpo da Requisição: application/json;
• Resposta de Sucesso: 200 OK;
• Resposta de Falha: 404 Not Found;

  Deletar Veículo
• URL: /api/veiculos/{id};
• Método HTTP: DELETE;
• Resposta de Sucesso: 204 No Content;
• Resposta de Falha: 404 Not Found;
