# Exercício Java – Uso de Atributos `static` e Métodos Estáticos

Este exercício em Java demonstra o conceito de **atributos `static`** e **métodos estáticos**. Ele explora como um atributo estático pode ser compartilhado entre todas as instâncias de uma classe, enquanto os atributos e métodos não estáticos são específicos para cada instância.

## Objetivo

* **Entender o uso de atributos e métodos estáticos** (`static`) em uma classe.
* **Explorar a diferença entre variáveis de instância** e **variáveis estáticas**.
* **Demonstrar a alteração de variáveis estáticas** por meio de métodos de instância.

## Estrutura do Projeto

* **App.java**: Classe principal onde duas instâncias da classe `User` são criadas, e o nome estático é modificado usando o método `setNomeStatic`.
* **User.java**: Classe que define um atributo estático `nomeStatic`, junto com um atributo de instância `idade`. A classe também inclui métodos para obter e definir esses valores.

## Exemplo de Saída

Ao executar o programa, a saída será:

```
11
Maria Flor
15
Maria Flor
```
