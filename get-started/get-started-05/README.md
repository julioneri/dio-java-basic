# Exercício Java – Uso de `record` e Funções Lambda com `Function`

Este exercício em Java demonstra o uso de **`record`** para representar dados imutáveis de maneira concisa, bem como a utilização de **funções lambda** e **interfaces funcionais**, como `Function`, para manipular e processar objetos de maneira flexível.

## Objetivo

* **Entender a sintaxe de `record`** e como ele pode ser usado para representar dados imutáveis de maneira simples.
* **Explorar a interface `Function`** para aplicar operações em elementos de uma coleção de forma genérica.
* **Aplicar expressões lambda** para passar comportamentos como parâmetros para métodos.
* **Utilizar `toString`, getters e funções customizadas** para imprimir propriedades de objetos.

## Estrutura do Projeto

* **User.java**: Classe `record` que define um usuário com um nome e idade. Os `records` são uma forma concisa de criar classes imutáveis, com getters automáticos e um `toString` gerado automaticamente.
* **App.java**: Classe principal que cria uma lista de `User` e aplica diferentes funções para imprimir o nome, idade e a representação de string dos usuários. Utiliza o método `printStringValue` com a interface `Function` e expressões lambda.

## Exemplo de Saída

Ao executar o programa, a saída será:

```
User[name=Maria, age=21]
User[name=João, age=33]
User[name=Eduardo, age=41]
User[name=Ana, age=19]
Maria
João
Eduardo
Ana
21
33
41
19
```
