# 🛒 Cadastro de Produtos em Java

Este é um projeto desenvolvido para praticar o uso de **Collections em Java**, utilizando `Set`, `TreeSet`, e implementando comparações personalizadas com `Comparable` e `Comparator`.

## 🧠 Funcionalidades

* Adicionar novos produtos ao cadastro.
* Exibir todos os produtos cadastrados.
* Exibir produtos ordenados por nome.
* Exibir produtos ordenados por preço.

## 📦 Estrutura do Projeto

```
src/
├── Main.java                # Classe principal com a execução do programa e testes.
├── CadastroProdutos.java    # Gerencia o cadastro de produtos e ordenações.
├── Produto.java             # Representa um produto com código, nome, preço e quantidade.
└── ComparatorPorPreco.java  # Implementação do comparador para ordenar produtos por preço.
```

## 📚 Contexto do Desafio

Este código foi desenvolvido como parte do módulo de **Collections em Java**, com foco em práticas de ordenação utilizando `Comparable` e `Comparator`. O projeto simula um cadastro de produtos, onde é possível ordenar os produtos de acordo com nome e preço.

## 💡 Como Funciona

* A classe `Produto` implementa a interface `Comparable` para ordenar os produtos por nome.
* A ordenação dos produtos por preço é feita utilizando um `Comparator` externo (`ComparatorPorPreco`).
* O cadastro de produtos é feito usando um `HashSet` para garantir que não haja produtos duplicados.
* Para exibir os produtos ordenados por nome ou preço, utilizam-se `TreeSet`, que aplica a ordenação automaticamente.

## ✅ Exemplo de Saída

```
{ Código: 1, Nome: Produto 5, Preço: 15.0, Qtde.: 5 }
{ Código: 2, Nome: Produto 0, Preço: 20.0, Qtde.: 10 }
{ Código: 1, Nome: Produto 3, Preço: 10.0, Qtde.: 2 }
{ Código: 9, Nome: Produto 9, Preço: 2.0, Qtde.: 2 }
{ Código: 5, Nome: Produto 1, Preço: 5.0, Qtde.: 7 }
=================
{ Código: 1, Nome: Produto 1, Preço: 5.0, Qtde.: 7 }
{ Código: 9, Nome: Produto 9, Preço: 2.0, Qtde.: 2 }
{ Código: 1, Nome: Produto 3, Preço: 10.0, Qtde.: 2 }
{ Código: 5, Nome: Produto 5, Preço: 15.0, Qtde.: 5 }
{ Código: 2, Nome: Produto 0, Preço: 20.0, Qtde.: 10 }
=================
{ Código: 9, Nome: Produto 9, Preço: 2.0, Qtde.: 2 }
{ Código: 5, Nome: Produto 1, Preço: 5.0, Qtde.: 7 }
{ Código: 1, Nome: Produto 3, Preço: 10.0, Qtde.: 2 }
{ Código: 1, Nome: Produto 5, Preço: 15.0, Qtde.: 5 }
{ Código: 2, Nome: Produto 0, Preço: 20.0, Qtde.: 10 }
```

## 📌 Observações

* A ordenação por nome é realizada utilizando o método `compareTo` da interface `Comparable`.
* A ordenação por preço é feita por meio do `Comparator` implementado na classe `ComparatorPorPreco`.
* A utilização de `TreeSet` garante que os produtos serão automaticamente ordenados de acordo com os critérios definidos.
