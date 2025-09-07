# Gerenciador de tarefas
Este projeto é um gerenciador básico de tarefas via API REST usando Spring Boot.

Esta aplicação necessita de um banco de dados MySQL na porta 3307. Caso queira trocar esta porta, modifique o arquivo **application.properties**.

Após iniciar a aplicação, você terá um CRUD de tarefa em **/tarefa**, onde cada tarefa possui um nome, um responsável e uma data de entrega. Automaticamente, um ID será gerado a cada inserção.

Você conseguirá fazer consultas completas e individuais, exclusão, criação e edição dos dados.
