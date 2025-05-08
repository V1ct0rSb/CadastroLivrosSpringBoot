# 📚 CadastroLivrosSpringBoot

Uma API RESTful desenvolvida com Spring Boot para gerenciar um catálogo de livros. Permite cadastro, listagem, atualização e exclusão de livros, editoras e categorias, além de buscas por título e filtros avançados.

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- JPA / Hibernate

## 📁 Estrutura do Projeto

- `/model`: classes de modelo (Livro, Categoria, Editora)
- `/controller`: endpoints REST para CRUD e busca
- `/service`: regras de negócio
- `/repository`: interfaces JPA para acesso ao banco de dados

## 🗃 Modelo Relacional

![Image](https://github.com/user-attachments/assets/f448af2d-fe65-485f-90d7-4efb7a859841)

## 📌 Funcionalidades

### 📘 Livro
- ✅ Cadastrar novo livro
- ✅ Listar todos os livros
- ✅ Buscar livro por ID
- ✅ Buscar livro por título
- ✅ Filtrar por categoria, editora e faixa de preço
- ✅ Atualizar livro
- ✅ Deletar livro

### 🏢 Editora
- ✅ Cadastrar nova editora
- ✅ Listar todas as editoras
- ✅ Deletar editora por ID

### 🗂️ Categoria
- ✅ Cadastrar nova categoria
- ✅ Listar todas as categorias
- ✅ Deletar categoria por ID

## 🧪 Exemplos de Endpoints

### 📘 Livros
- `GET /livros` → Lista todos os livros
- `GET /livros/{id}` → Busca livro por ID
- `GET /livros/titulo/{titulo}` → Busca livro por título
- `GET /livros/filtros?categoriaId=1&editoraId=2&precoMin=10&precoMax=100` → Filtro
- `POST /livros` → Cadastra um livro
- `PUT /livros/{id}` → Atualiza um livro
- `DELETE /livros/{id}` → Remove um livro

### 🏢 Editoras
- `GET /editoras` → Lista todas as editoras
- `POST /editoras` → Cadastra uma nova editora
- `DELETE /editoras/{id}` → Remove uma editora

### 🗂️ Categorias
- `GET /categorias` → Lista todas as categorias
- `POST /categorias` → Cadastra uma nova categoria
- `DELETE /categorias/{id}` → Remove uma categoria


