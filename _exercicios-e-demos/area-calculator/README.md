# Exercício em Java – Cálculo de Áreas de Formas Geométricas

Este exercício em Java demonstra o uso de **interfaces** e **classes** para representar e calcular as áreas de diferentes formas geométricas: **Quadrado**, **Retângulo** e **Círculo**. O código destaca o uso de **polimorfismo** e **composição**, além de fornecer uma interface comum para o cálculo das áreas das formas geométricas.

## Objetivo

* **Representar diferentes formas geométricas** usando uma interface `GeometricForm`.
* Calcular a **área das formas geométricas** como o **Quadrado**, **Retângulo** e **Círculo**.
* **Utilizar polimorfismo** para instanciar e manipular objetos das diferentes formas geométricas.
* **Interagir com o usuário** por meio de um menu para escolher a forma e fornecer os parâmetros necessários para o cálculo da área.

## Estrutura do Projeto

* **App.java**: Classe principal onde o programa é executado, apresentando um menu de opções e permitindo ao usuário escolher a forma geométrica para calcular a área.
* **GeometricForm.java**: Interface comum que define o método `getArea()` para calcular a área das formas geométricas.
* **Square.java**: Classe que representa um **Quadrado**, implementando a interface `GeometricForm` e calculando a área.
* **Rectangle.java**: Classe que representa um **Retângulo**, implementando a interface `GeometricForm` e calculando a área.
* **Circle.java**: Classe que representa um **Círculo**, implementando a interface `GeometricForm` e calculando a área.

## Como Funciona

1. O programa exibe um menu para o usuário escolher entre **Quadrado**, **Retângulo**, **Círculo** ou sair do programa.
2. Dependendo da escolha do usuário, o programa solicita as dimensões necessárias (lado, altura, base ou raio) para a forma selecionada.
3. O programa calcula a área usando o método `getArea()` da interface `GeometricForm`, que é implementado por cada classe de forma geométrica.
4. O resultado da área é exibido para o usuário, e o programa continua até que o usuário escolha a opção de sair.

## Exemplo de Saída

```
Escolha a forma geométrica para calcular a área.
1 - Quadrado
2 - Retângulo
3 - Círculo
4 - Sair do programa
Digite: 1
Informe o tamanho dos lados: 4
O resultado do cálculo da área foi de 16.0

Escolha a forma geométrica para calcular a área.
1 - Quadrado
2 - Retângulo
3 - Círculo
4 - Sair do programa
Digite: 2
Informe a altura: 5
Informe a base: 3
O resultado do cálculo da área foi de 15.0

Escolha a forma geométrica para calcular a área.
1 - Quadrado
2 - Retângulo
3 - Círculo
4 - Sair do programa
Digite: 3
Informe o raio: 7
O resultado do cálculo da área foi de 153.86
```

## Observações

* O programa utiliza **polimorfismo** para tratar as diferentes formas geométricas de maneira uniforme, utilizando a interface `GeometricForm`.
* Cada forma geométrica implementa seu próprio método `getArea()`, de acordo com sua fórmula matemática para o cálculo da área.
* A interação com o usuário é feita por meio do console, permitindo a escolha das formas e a inserção dos parâmetros necessários.
