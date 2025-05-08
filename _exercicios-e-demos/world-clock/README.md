# Exercício em Java – Relógios com Classes Seladas e Conversão de Formato

Este exercício em Java demonstra o uso de **classes seladas** para representar dois tipos distintos de relógios: o **BRLClock** (formato 24h) e o **USClock** (formato 12h com AM/PM). O código destaca o uso de **herança**, **polimorfismo**, **pattern matching** e **conversão entre formatos de hora** de forma segura e orientada a objetos.

## Objetivo

* **Representar diferentes formatos de relógio** com base em uma superclasse abstrata `Clock`.
* Utilizar **classes seladas (`sealed`)** para restringir a hierarquia e permitir somente subclasses autorizadas.
* **Converter horários entre os formatos BRL (24h)** e **US (12h AM/PM)**.
* Utilizar **polimorfismo e sobrescrita de métodos** para exibir e manipular horários corretamente.
* Aplicar **pattern matching com `switch`** para converter tipos de relógios dinamicamente.

## Estrutura do Projeto

* **Clock.java**: Classe abstrata `sealed` que define a estrutura base de um relógio, incluindo os atributos de hora, minuto e segundo, além do método abstrato `convert()`.
* **BRLClock.java**: Classe `non-sealed` que representa relógios no formato 24h e implementa conversões a partir de `USClock`.
* **USClock.java**: Classe `non-sealed` que representa relógios no formato 12h com AM/PM e realiza a conversão a partir de `BRLClock`.
* **Main.java**: Classe principal que instancia objetos dos dois tipos de relógio, define seus horários e imprime os resultados no console, incluindo conversões entre os formatos.

## Exemplo de Saída

Ao executar o programa, a saída será semelhante a:

```
23:00:00
11:00:00 PM
11:00:00 PM
23:00:00
```
