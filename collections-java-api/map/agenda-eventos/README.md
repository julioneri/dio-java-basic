# 📅 Agenda de Eventos em Java

Este é um projeto simples desenvolvido como parte dos desafios práticos propostos nas aulas sobre **Collections em Java**, disponíveis na plataforma **[DIO - Digital Innovation One](https://www.dio.me/)**. O objetivo é reforçar o uso de **Map** e ordenação com **TreeMap** para organizar eventos por data.

## 🧠 Funcionalidades

* Adicionar eventos com data, nome e atração.
* Exibir todos os eventos da agenda de forma ordenada.
* Obter o próximo evento a acontecer com base na data atual.

## 📦 Estrutura do Projeto

```
src/
├── Main.java              # Classe principal com a execução e testes.
├── Evento.java            # Representa um evento com nome e atração.
└── AgendaEventos.java     # Gerencia o mapa de eventos e suas operações.
```

## 📚 Contexto do Desafio

Este código foi desenvolvido como parte do módulo de **Collections em Java**, com foco em como utilizar **Map**, especialmente **TreeMap**, para manter elementos ordenados por chave — neste caso, por **datas**. O projeto explora a manipulação de objetos e lógica de comparação de datas com `LocalDate`.

## 💡 Como Funciona

* A classe `Evento` contém os atributos `nome` e `atração`, além de um `toString()` customizado para exibição amigável.
* A classe `AgendaEventos` usa um `Map<LocalDate, Evento>` para armazenar eventos e transforma em `TreeMap` na hora de exibir ordenadamente.
* O método `obterProximoEvento()` identifica o primeiro evento cuja data seja igual ou posterior à data atual (`LocalDate.now()`).

## ✅ Exemplo de Saída

```
{2000-01-10=Evento{nome=Evento 3', atracao=Atração 3}, 2022-07-09=Evento{nome=Evento 2', atracao=Atração 2}, 2022-07-15=Evento{nome=Evento 1', atracao=Atração 1}, 2025-12-25=Evento{nome=Evento 4', atracao=Atração 4}, 2030-01-01=Evento{nome=Evento 5', atracao=Atração 5}}
=================
O próximo evento: Evento{nome=Evento 4', atracao=Atração 4} acontecerá na data 2025-12-25
```

## 📌 Observações

* Os eventos são armazenados em um **Map**, mas exibidos com um **TreeMap** para garantir ordenação por data.
* O projeto utiliza `LocalDate` para trabalhar com datas de forma moderna e segura.
* A lógica considera a data atual para buscar o evento mais próximo no futuro (inclusive no mesmo dia).
