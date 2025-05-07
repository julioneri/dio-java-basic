# 📝 Lista de Tarefas em Java

Este é um projeto simples desenvolvido como parte dos desafios práticos propostos nas aulas sobre **Collections em Java**, disponíveis na plataforma **[DIO - Digital Innovation One](https://www.dio.me/)**. O exercício visa reforçar conceitos como criação de classes, uso de listas (`ArrayList`) e manipulação de objetos.

## 🧠 Funcionalidades

* Adicionar uma nova tarefa à lista.
* Remover todas as tarefas com uma descrição específica.
* Contar o número total de tarefas.
* Exibir todas as tarefas cadastradas no console.

## 📦 Estrutura do Projeto

```
src/
├── Main.java         # Classe principal com a execução do programa e testes.
├── ListaTarefa.java  # Gerencia a lista de tarefas (adicionar, remover, listar).
└── Tarefa.java       # Representa uma tarefa com descrição.
```

## 📚 Contexto do Desafio

Este código foi criado como parte do acompanhamento do módulo de **Collections em Java**, onde aprendemos a manipular listas dinamicamente e aplicar princípios básicos da **Programação Orientada a Objetos**.

## 💡 Como Funciona

* Ao iniciar, a lista está vazia.
* Tarefas podem ser adicionadas quantas vezes forem necessárias.
* Ao remover, **todas as tarefas** com a descrição informada são eliminadas.
* As descrições das tarefas são exibidas diretamente no console.

## ✅ Exemplo de Saída

```
O número total de elementos na lista é: 0
O número total de elementos na lista é: 3
O número total de elementos na lista é: 1
[Tarefa nº 3]
```

## 📌 Observações

* O método `obterDescricoesTarefas()` usa `System.out.println()` para exibir as tarefas.
* Este exercício é ideal para quem está estudando a base das **Collections em Java** e deseja reforçar o uso de listas, loops e encapsulamento.
