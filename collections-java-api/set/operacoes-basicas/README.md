# 🎉 Gerenciamento de Convidados

Este é um projeto desenvolvido para praticar o uso de **Sets** em Java, com foco na implementação de um conjunto de convidados para um evento. O objetivo é demonstrar a manipulação de objetos em coleções e o uso de métodos como **adicionar**, **remover** e **contar** elementos.

## 🧠 Funcionalidades

* Adicionar um convidado ao conjunto com um nome e código de convite.
* Remover um convidado do conjunto usando o código do convite.
* Contar o número de convidados presentes no conjunto.
* Exibir a lista de convidados no console.

## 📦 Estrutura do Projeto

```
src/
├── Main.java              # Classe principal com a execução do programa e testes.
├── Convidado.java         # Representa um convidado com nome e código de convite.
└── ConjuntoConvidados.java # Gerencia o conjunto de convidados e as operações.
```

## 📚 Contexto do Desafio

Este código foi desenvolvido para praticar a manipulação de **Sets** e a implementação de métodos de adição, remoção e contagem de elementos. O projeto é ideal para aprender a trabalhar com **coleções em Java**, focando em **HashSet**, que garante a exclusão de elementos duplicados com base no **equals** e **hashCode**.

## 💡 Como Funciona

* A classe `Convidado` representa um convidado, com nome e código de convite, e implementa **equals** e **hashCode** para garantir que convidados com o mesmo código não sejam duplicados.
* A classe `ConjuntoConvidados` gerencia o conjunto de convidados, permitindo adicionar, remover e contar os convidados.
* Os métodos retornam o conjunto atualizado e não modificam diretamente a estrutura do conjunto original.

## ✅ Exemplo de Saída

```
Existem 4 convidado(s) dentro do Set de Convidados.
===========================
[Convidado [nome=Convidado 1, codigoConvite=12345], Convidado [nome=Convidado 3, codigoConvite=67890], Convidado [nome=Convidado 4, codigoConvite=13579], Convidado [nome=Convidado 2, codigoConvite=12345]]
Existem 3 convidado(s) dentro do Set de Convidados.
===========================
[Convidado [nome=Convidado 1, codigoConvite=12345], Convidado [nome=Convidado 3, codigoConvite=67890], Convidado [nome=Convidado 2, codigoConvite=12345]]
```

## 📌 Observações

* **HashSet** foi utilizado para garantir que não existam convidados duplicados com base no código de convite.
* O código permite adicionar e remover convidados dinamicamente.