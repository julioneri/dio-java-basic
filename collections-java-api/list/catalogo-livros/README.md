# 📚 Catálogo de Livros em Java

Este projeto foi desenvolvido como parte dos desafios práticos da plataforma **[DIO - Digital Innovation One](https://www.dio.me/)**, com o objetivo de praticar os fundamentos de **Collections em Java**, especialmente o uso de listas (`ArrayList`) e busca de dados em coleções.

## 🧠 Funcionalidades

* Adicionar novos livros ao catálogo.
* Pesquisar livros por autor (retorna todos os livros do autor).
* Pesquisar livros por intervalo de anos de publicação.
* Pesquisar um livro específico pelo título.

## 📦 Estrutura do Projeto

```
src/
├── Main.java           # Classe principal com exemplos de uso.
├── CatalogoLivros.java # Gerencia a lista de livros e operações de pesquisa.
└── Livro.java          # Representa um livro com título, autor e ano de publicação.
```

## 📚 Contexto do Desafio

Este exercício faz parte do módulo de **Collections em Java**, abordando a manipulação de listas e a aplicação de filtros com base em atributos específicos dos objetos.

## 💡 Como Funciona

* O catálogo armazena todos os livros adicionados pelo usuário.
* A busca por autor é **case-insensitive** e retorna todos os livros correspondentes.
* A busca por intervalo de anos retorna todos os livros publicados entre os anos informados.
* A busca por título retorna o **primeiro livro** que corresponde ao nome informado.

## ✅ Exemplo de Saída

```
[Livro [titulo=Livro 1, autor=Autor 1, anopublicacao=2021], Livro [titulo=Livro 1, autor=Autor 1, anopublicacao=2022]]
=================
[Livro [titulo=Livro 1, autor=Autor 1, anopublicacao=2022], Livro [titulo=Livro 3, autor=Autor 3, anopublicacao=2023], Livro [titulo=Livro 4, autor=Autor 4, anopublicacao=2024]]
=================
Livro [titulo=Livro 1, autor=Autor 1, anopublicacao=2021]
```

## 📌 Observações

* O método `pesquisarPorTitulo` retorna apenas **um** livro com o título correspondente.
* A classe `Livro` utiliza o método `toString()` para exibir informações de forma legível no console.
