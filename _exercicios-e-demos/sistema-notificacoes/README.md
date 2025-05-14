# Exercício em Java – Sistema de Notificações com Padrões de Projeto

Este projeto Java implementa um **sistema de envio de notificações** utilizando os padrões de projeto **Facade**, **Strategy** e **Singleton**. O objetivo é oferecer uma estrutura simples, coesa e extensível para envio de notificações por diferentes canais, como **Email** e **SMS**.

## Objetivo

* Demonstrar a aplicação prática de padrões de projeto em Java.
* Fornecer uma **interface unificada de notificação** para o envio de mensagens.
* **Desacoplar a lógica de envio** de notificações utilizando o padrão **Strategy**.
* Gerenciar **configurações globais da aplicação** com o padrão **Singleton**.
* Facilitar o uso por meio de uma interface de alto nível com o padrão **Facade**.

## Estrutura do Projeto

* **Main.java**  
  Classe principal que inicializa a aplicação, imprime informações do ambiente e envia mensagens utilizando `NotificationFacade`.

* **config/AppConfig.java**  
  Classe responsável por fornecer as configurações globais do sistema (como ambiente e versão), implementada com o padrão Singleton.

* **facade/NotificationFacade.java**  
  Implementa a **facade** para envio de notificações. Recebe o tipo de notificação (EMAIL ou SMS) e delega a lógica de envio à estratégia correspondente.

* **strategy/NotificationStrategy.java**  
  Interface que define o contrato comum para envio de mensagens (`enviar(destinatario, mensagem)`).

* **strategy/EmailStrategy.java**  
  Estratégia de envio de mensagens por **Email**.

* **strategy/SmsStrategy.java**  
  Estratégia de envio de mensagens por **SMS**.

## Como Funciona

1. A classe `Main` acessa as configurações globais do sistema usando `AppConfig` (Singleton).
2. A aplicação instancia a `NotificationFacade`, que funciona como um ponto de acesso único para o envio de notificações.
3. A `NotificationFacade` determina qual estratégia deve ser utilizada com base no tipo de notificação (EMAIL ou SMS).
4. A estratégia correspondente é utilizada para enviar a mensagem ao destinatário.

## Exemplo de Saída

```
Ambiente: Produção
Versão: 1.0
Enviando email para alice@hotmail.com: Olá Alice, seu evento foi realizado com sucesso!
Enviando SMS para +5511999999999: Olá Bob, seu evento foi realizado com sucesso!
```