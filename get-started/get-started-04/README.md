# Exercício em Java – Interfaces e Polimorfismo com Dispositivos Multimídia

Este exercício em Java demonstra o uso de **interfaces** para definir comportamentos comuns entre dispositivos que executam **mídia de áudio e vídeo**. O projeto explora conceitos de **polimorfismo**, **implementação múltipla de interfaces** e **encapsulamento de comportamento** por meio de chamadas genéricas para métodos de reprodução.

## Objetivo

* **Definir contratos de comportamento** com interfaces `MusicPlayer` e `VideoPlayer`.
* **Implementar múltiplas interfaces** em classes concretas (`Computer`, `Smartphone`) para permitir reprodução de áudio e vídeo.
* **Utilizar polimorfismo** para chamar métodos genéricos sem conhecer a implementação específica.
* **Simular diferentes dispositivos** como caixas de música, computadores e smartphones com funcionalidades multimídia.

## Estrutura do Projeto

* **Main.java**: Classe principal que invoca métodos genéricos para tocar música e vídeo, demonstrando o uso de polimorfismo com interfaces.
* **MusicPlayer.java**: Interface que define os métodos relacionados à reprodução de música (`playMusic`, `pauseMusic`, `stopMusic`).
* **VideoPlayer.java**: Interface que define os métodos de controle de vídeo (`playVideo`, `pauseVideo`, `stopVideo`).
* **Computer.java**: Classe que implementa ambas as interfaces, simulando um computador multimídia.
* **Smartphone.java**: Classe que também implementa `MusicPlayer` e `VideoPlayer`, simulando um smartphone.
* **MusicBox.java**: Classe que implementa apenas `MusicPlayer`, simulando uma caixa de música.

## Exemplo de Saída

Ao executar o programa, a saída será semelhante a:

```
O computador está tocando a música...
O computador está tocando o vídeo...
```
