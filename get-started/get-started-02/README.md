# Exercício em Java - Classe Person

Este exercício em Java demonstra o uso de **`record`** para representar e manipular objetos de uma classe personalizada chamada `Person`. O código ilustra a criação de **construtores**, o uso de **métodos personalizados** e a manipulação de informações de forma concisa e eficaz.

## Objetivo

* **Representar uma pessoa** usando um `record` em Java.
* **Criar construtores** com diferentes parâmetros para flexibilizar a criação de objetos.
* **Exibir informações formatadas** sobre o objeto utilizando métodos personalizados.
* Explorar os recursos modernos do Java, como **`record`**, para tentar simplificar o código.

## Estrutura do Projeto

* **Person.java**: Define o `record` `Person`, com dois construtores e um método `getInfo()` que retorna informações formatadas sobre a pessoa.
* **App.java**: Classe principal que instancia e manipula objetos da classe `Person`, exibindo as informações no console.

## Exemplo de Saída

Ao executar o programa, a saída será semelhante a:

```
Name: João | Age: 1
João
Person[name=João, age=13]
```