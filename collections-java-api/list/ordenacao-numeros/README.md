# 📊 Ordenação de Números em Java

Este projeto foi desenvolvido como parte de um exercício prático para demonstrar o uso de **Collections** e métodos de ordenação em **Java**. O objetivo é praticar a manipulação de listas e aplicar técnicas de ordenação tanto ascendente quanto descendente utilizando a classe `Collections`.

## 🧠 Funcionalidades

* Adicionar números à lista.
* Ordenar a lista em ordem crescente.
* Ordenar a lista em ordem decrescente.
* Exibir as listas ordenadas no console.

## 📦 Estrutura do Projeto

```
src/
├── Main.java              # Classe principal, onde o programa é executado e os testes são realizados.
└── OrdenacaoNumeros.java  # Gerencia a lista de números e as ordenações.
```

## 📚 Contexto do Desafio

Este código foi desenvolvido com o propósito de praticar **manipulação de listas** e a utilização das funções de ordenação da **classe Collections** em Java. O desafio oferece uma boa oportunidade para aprender como ordenar elementos de uma lista de forma simples e eficiente.

## 💡 Como Funciona

* A classe `OrdenacaoNumeros` gerencia a lista de números e possui métodos para adicionar números e ordenar a lista.
* O método `ordenarAscendente()` utiliza o `Collections.sort()` para ordenar os números em ordem crescente.
* O método `ordenarDescendente()` usa `Collections.sort()` com `Collections.reverseOrder()` para ordenar os números em ordem decrescente.
* As listas ordenadas são retornadas sem alterar a lista original.

## ✅ Exemplo de Saída

```
Ordem ascendente:       [1, 2, 3, 4, 5]
=======================================
Ordem descendente:      [5, 4, 3, 2, 1]
```

## 📌 Observações

* As listas ordenadas são geradas como novas instâncias, preservando a lista original.
* O código utiliza a classe `ArrayList` para armazenar os números e `Collections` para realizar a ordenação.
