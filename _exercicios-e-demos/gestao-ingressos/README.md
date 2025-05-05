# Exercício em Java – Sistema de Ingressos com Classes Seladas

Este projeto em Java simula um sistema de emissão de ingressos para cinema, utilizando **classes seladas (`sealed`)**, **enums**, e **herança** para representar diferentes tipos de ingresso, como **meia entrada** e **ingresso família**, com regras de cálculo de valor específicas para cada caso.

## Objetivo

* Criar uma hierarquia de ingressos com uma **classe base selada `Ingresso`**.
* Utilizar **herança** para implementar variações como `IngressoMeia` e `IngressoFamilia`.
* Aplicar **enums** (`TipoAudio`, `TipoLegenda`) para representar características do ingresso.
* Calcular o **valor final do ingresso** de acordo com suas regras específicas:

  * Meia entrada → 50% do valor total.
  * Ingresso família → desconto de 5% caso haja mais de 3 pessoas.
* Utilizar **`switch` com pattern matching** para exibir informações dos ingressos de forma diferenciada.

## Estrutura do Projeto

* **Ingresso.java**: Classe abstrata `sealed` que define os atributos e o contrato para cálculo do valor final dos ingressos.
* **IngressoMeia.java**: Subclasse `non-sealed` que representa o ingresso de meia entrada (50% do valor).
* **IngressoFamilia.java**: Subclasse `non-sealed` que representa ingresso familiar com possível desconto.
* **TipoAudio.java**: Enum que define se o áudio do filme é `DUBLADO` ou `ORIGINAL`.
* **TipoLegenda.java**: Enum com opções de legenda (`NENHUMA`, `TRADUCAO`, `DESCRITIVA`).
* **App.java**: Classe principal que cria e exibe ingressos com diferentes configurações.

## Exemplo de Saída

```
======  Ingresso Meia Entrada  ======
Valor:      R$ 5.00
Filme:      O jovem programador: O início
Áudio:      DUBLADO
Legenda:    NENHUMA
=====================================
========  Ingresso  Familia  ========
Valor:      R$ 90.00
Filme:      O jovem programador: O retorno
Áudio:      ORIGINAL
Legenda:    TRADUCAO
=====================================
========  Ingresso  Familia  ========
Valor:      R$ 114.00
Filme:      O jovem programador: A ascenção
Áudio:      ORIGINAL
Legenda:    NENHUMA
=====================================
```
