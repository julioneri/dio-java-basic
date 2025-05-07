# 🧑‍🤝‍🧑 Ordenação de Pessoas em Java

Este é um projeto simples desenvolvido como parte dos desafios práticos propostos nas aulas sobre **Collections em Java**, disponíveis na plataforma **[DIO - Digital Innovation One](https://www.dio.me/)**. O objetivo é reforçar o uso de listas e a implementação de ordenações personalizadas utilizando `Comparable` e `Comparator`.

## 🧠 Funcionalidades

* Adicionar uma nova pessoa à lista.
* Ordenar a lista de pessoas por idade (usando `Comparable`).
* Ordenar a lista de pessoas por altura (usando `Comparator`).
* Exibir os dados ordenados no console.

## 📦 Estrutura do Projeto

```
src/
├── Main.java               # Classe principal com a execução do programa e testes.
├── OrdenacaoPessoa.java    # Gerencia a lista de pessoas e ordenações.
└── Pessoa.java             # Representa uma pessoa com nome, idade e altura.
```

## 📚 Contexto do Desafio

Este código foi desenvolvido como parte do módulo de **Collections em Java**, com foco em práticas de ordenação com listas e uso de interfaces como `Comparable` e `Comparator`. É ideal para consolidar os fundamentos da **Programação Orientada a Objetos** e da **manipulação de coleções** em Java.

## 💡 Como Funciona

* A classe `Pessoa` implementa `Comparable`, permitindo ordenação natural por idade.
* A ordenação por altura é realizada através de um `Comparator` externo.
* Os métodos retornam listas ordenadas sem modificar a lista original.

## ✅ Exemplo de Saída

```
[Pessoa [nome=Nome 1, idade=20, altura=1.57], Pessoa [nome=Nome 3, idade=25, altura=1.7], Pessoa [nome=Nome 2, idade=30, altura=1.8]]
=======================================
[Pessoa [nome=Nome 1, idade=20, altura=1.57], Pessoa [nome=Nome 4, idade=17, altura=1.57], Pessoa [nome=Nome 3, idade=25, altura=1.7]]
```
