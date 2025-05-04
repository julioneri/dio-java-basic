# Exercício em Java – Herança e Polimorfismo com Classes Seladas

Este exercício em Java demonstra o uso de **classes seladas** (`sealed`, `non-sealed`) para representar e manipular objetos de uma hierarquia de funcionários (`Employee`). O código ilustra conceitos fundamentais como **herança**, **polimorfismo**, **sobrescrita de métodos** e **pattern matching** com `switch`.

## Objetivo

* **Representar diferentes tipos de funcionários** (`Manager` e `Salesman`) usando herança.
* **Controlar a hierarquia de classes** com o uso de `sealed` e `non-sealed`.
* **Aplicar polimorfismo** para manipular objetos de subclasses através de uma superclasse comum.
* **Sobrescrever métodos** com comportamentos específicos para cada tipo de funcionário.
* **Utilizar `switch` com pattern matching** para lidar com diferentes tipos em tempo de execução.

## Estrutura do Projeto

* **Employee.java**: Classe abstrata selada que define os atributos e comportamentos base de um funcionário, incluindo o método abstrato `getFullSalary()`.
* **Manager.java**: Subclasse não selada que adiciona atributos como login, senha e comissão, e sobrescreve o cálculo de salário.
* **Salesman.java**: Subclasse não selada que define comissão baseada em percentual de vendas.
* **Main.java**: Classe principal que instancia objetos de `Manager` e `Salesman`, utilizando `switch` com pattern matching para configurar e exibir suas informações.

## Exemplo de Saída

Ao executar o programa, a saída será semelhante a:

```
======= domain.Manager =======
MN123
5000.0
João
joao
1234567
1200.0
6700.0
6200.0
=======================
======= domain.Salesman =======
SL567
2800.0
Lucas
10.0
1000.0
4300.0
3800.0
=======================
```
