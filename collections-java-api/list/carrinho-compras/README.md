# 🛒 Carrinho de Compras em Java

Este é um projeto simples desenvolvido como parte dos desafios práticos propostos nas aulas sobre **Collections em Java**, disponíveis na plataforma **[DIO - Digital Innovation One](https://www.dio.me/)**. O exercício visa reforçar conceitos como criação de classes, uso de listas (`ArrayList`) e manipulação de objetos.

## 🧠 Funcionalidades

* Adicionar itens ao carrinho com nome, preço e quantidade.
* Remover todos os itens com um nome específico.
* Exibir os itens atualmente presentes no carrinho.

## 📦 Estrutura do Projeto

```
src/
├── Main.java               # Classe principal com a execução do programa e testes.
├── CarrinhoDeCompras.java  # Gerencia o carrinho e suas operações.
└── Item.java               # Representa um item com nome, preço e quantidade.
```

## 📚 Contexto do Desafio

Este código foi criado como parte do acompanhamento do módulo de **Collections em Java**, onde aprendemos a manipular listas dinamicamente e aplicar princípios básicos da **Programação Orientada a Objetos**.

## 💡 Como Funciona

* Ao iniciar, o carrinho está vazio.
* Itens podem ser adicionados com nome, valor e quantidade.
* Ao remover, **todos os itens** com o nome informado são eliminados.
* Os dados dos itens são exibidos diretamente no console.

## ✅ Exemplo de Saída

```
Item: Biscoito
Preço: 3.0
Quantidade: 5
Item: Café
Preço: 13.0
Quantidade: 1
Item: Arroz
Preço: 17.0
Quantidade: 1
=================
Nenhum item com este nome foi encontrado.
Todos os itens especificados foram removidos com sucesso!
=================
Item: Café
Preço: 13.0
Quantidade: 1
Item: Arroz
Preço: 17.0
Quantidade: 1
```

## 📌 Observações

* O método `exibirItens()` utiliza `System.out.println()` para imprimir os dados dos itens.
* Este exercício é ideal para quem está estudando a base das **Collections em Java** e deseja reforçar o uso de listas, estruturas de repetição e boas práticas com métodos e encapsulamento.
