# 📞 Agenda de Contatos em Java

Este é um projeto simples desenvolvido como parte dos desafios práticos propostos nas aulas sobre **Collections em Java**, disponíveis na plataforma **[DIO - Digital Innovation One](https://www.dio.me/)**. O objetivo é reforçar o uso de **`Set`** para armazenar contatos de forma que não haja duplicação de nomes.

## 🧠 Funcionalidades

* Adicionar um novo contato à agenda.
* Atualizar o número de um contato existente.
* Pesquisar contatos pelo nome.
* Exibir os contatos na agenda.

## 📦 Estrutura do Projeto

```
src/
├── Main.java              # Classe principal com a execução do programa e testes.
├── Contato.java           # Representa um contato com nome e número.
└── AgendaContatos.java    # Gerencia a lista de contatos e as operações.
```

## 📚 Contexto do Desafio

Este código foi desenvolvido como parte do módulo de **Collections em Java**, com foco em como utilizar **`Set`** para armazenar dados sem permitir duplicações. O projeto envolve a manipulação de objetos e operações de pesquisa e atualização de dados dentro de uma agenda de contatos.

## 💡 Como Funciona

* A classe `Contato` possui atributos como nome e número, e define os métodos `hashCode` e `equals` para garantir a unicidade de contatos na agenda.
* A classe `AgendaContatos` utiliza um `Set<Contato>` para armazenar os contatos e permite adicionar, pesquisar e atualizar os dados.
* O programa não permite a duplicação de contatos com o mesmo nome.

## ✅ Exemplo de Saída

```
[{Maria, 1234567}, {Camila Cavalcante, 1111111}, {Camila Silva, 67894555}, {Maria Silva, 1111111}]
=======================================
{Camila Cavalcante, 1111111}
=======================================
Contato atualizado: {Maria Silva, 7777777}
[{Maria, 1234567}, {Camila Cavalcante, 1111111}, {Camila Silva, 67894555}, {Maria Silva, 7777777}]
```

## 📌 Observações

* A agenda de contatos é implementada com um **Set**, garantindo que não haja duplicação de nomes.
* A pesquisa de contatos retorna aqueles cujo nome começa com o nome fornecido.
* O número de um contato pode ser atualizado e a agenda reflete as modificações.
