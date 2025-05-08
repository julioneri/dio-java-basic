# Exercício em Java – Gerenciador de Alunos com Ordenações

Este exercício em Java demonstra a manipulação de conjuntos de objetos, utilizando `HashSet` e `TreeSet`, além de comparadores personalizados para ordenação. O código utiliza uma classe para gerenciar uma lista de alunos, permitindo cadastrar, exibir e remover alunos com base na matrícula, nome e média.

## Objetivo

* **Cadastrar alunos** com nome, matrícula e média.
* **Remover alunos** com base no número de matrícula.
* **Exibir alunos cadastrados**, em diferentes critérios de ordenação.
* **Demonstrar o uso de `Set`** para garantir unicidade e eficiência nas operações.
* **Implementar ordenações personalizadas** usando `Comparable` e `Comparator`.

## Estrutura do Projeto

* **Main.java**: Classe principal que instancia o objeto `GerenciadorAlunos`, testa as funcionalidades de cadastro, remoção e exibição.
* **GerenciadorAlunos.java**: Classe que gerencia o conjunto de alunos, com métodos para adicionar, remover e exibir dados em diferentes ordens.
* **Aluno.java**: Classe que representa o aluno, implementando `Comparable` para ordenação por nome e sobrescrevendo `equals()` e `hashCode()` com base na matrícula.
* **ComparatorPorMedia.java**: Classe auxiliar que implementa `Comparator` para ordenar os alunos com base na média.

## Funcionalidades

* **Adicionar Aluno**: Cadastra um novo aluno no conjunto, evitando duplicidade por matrícula.
* **Remover Aluno**: Remove um aluno com base na matrícula informada.
* **Exibir Alunos**: Mostra todos os alunos cadastrados sem ordenação.
* **Exibir Alunos por Nome**: Mostra os alunos ordenados alfabeticamente pelo nome.
* **Exibir Alunos por Média**: Mostra os alunos ordenados de forma crescente pela média.

## Exemplo de Saída

Ao executar o programa, a saída será semelhante a:

```
========= Cadastrando Alunos... =========
========== Alunos Cadastrados! ==========
Aluno 10005009 removido com sucesso!
Nenhum aluno com a matrícula informada foi encontrado.
=========================================
[Alunos ordenados por nome...]
[Alunos ordenados por média...]
```

## Observações

* O programa utiliza `HashSet` para evitar duplicatas com base na matrícula dos alunos.
* A ordenação por nome utiliza `TreeSet` com a ordenação natural da classe `Aluno`, baseada em `Comparable`.
* A ordenação por média utiliza `TreeSet` com o comparador `ComparatorPorMedia`.
* O código é um bom exemplo de como combinar estruturas de dados e comparadores para manipular coleções de objetos em Java.
