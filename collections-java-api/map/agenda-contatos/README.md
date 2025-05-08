# 📱 Agenda de Contatos com Map em Java

Este é um projeto simples desenvolvido como parte dos desafios práticos propostos nas aulas sobre **Collections em Java**, disponíveis na plataforma **[DIO - Digital Innovation One](https://www.dio.me/)**. O objetivo é reforçar o uso de **`Map`** para armazenar contatos, permitindo a busca, adição e remoção de dados de maneira eficiente.

## 🧠 Funcionalidades

* Adicionar um novo contato à agenda.
* Remover um contato da agenda.
* Pesquisar um número de telefone com base no nome do contato.
* Exibir todos os contatos presentes na agenda.

## 📦 Estrutura do Projeto

```
src/
├── Main.java              # Classe principal com a execução do programa e testes.
└── AgendaContatos.java    # Gerencia a lista de contatos e as operações usando Map.
```

## 📚 Contexto do Desafio

Este código foi desenvolvido como parte do módulo de **Collections em Java**, com foco em como utilizar **`Map`** para armazenar dados de forma eficiente. A agenda de contatos utiliza o nome do contato como chave e o número de telefone como valor, proporcionando operações rápidas de busca e remoção.

## 💡 Como Funciona

* A classe `AgendaContatos` utiliza um **`Map<String, Integer>`**, onde a chave é o nome do contato e o valor é o número de telefone.
* O método `adicionarContato()` adiciona ou atualiza um contato na agenda.
* O método `removerContato()` permite a remoção de um contato a partir do nome.
* O método `pesquisarPorNome()` retorna o número de telefone associado ao nome fornecido.
* O método `exibirContatos()` imprime todos os contatos presentes na agenda.

## ✅ Exemplo de Saída

```
{Maria=1234567, Maria João=1111111, Maria Silva=7654321, João Lucas=1111111}
=======================================
{Maria=1234567, Maria João=1111111, João Lucas=1111111}
=======================================
O número é: 1111111
```

## 📌 Observações

* A agenda de contatos é implementada com um **Map**, o que permite operações eficientes de pesquisa, adição e remoção de contatos.
* O programa substitui o número de telefone do contato caso o nome seja repetido.
* O número de um contato pode ser buscado com base no nome utilizando o método `pesquisarPorNome`.
