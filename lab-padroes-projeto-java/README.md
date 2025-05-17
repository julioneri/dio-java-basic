# Padrões de Projeto em Java

Este repositório contém uma implementação simples e objetiva de três dos principais **Padrões de Projeto (Design Patterns)** em Java, com fins educacionais, baseada no conteúdo oferecido pela **Digital Innovation One (DIO)**.

## 📌 Objetivo

Demonstrar a aplicação prática dos padrões de projeto:
- **Singleton**
- **Strategy**
- **Facade**

Cada padrão é implementado de forma isolada e utilizada em um exemplo funcional na classe `Main`, para facilitar a compreensão de seu uso e propósito.

---

## 🧩 Padrões Implementados

### 🔁 Singleton

Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela.

Implementações disponíveis:
- `SingletonLazy` - Instância é criada sob demanda.
- `SingletonEager` - Instância é criada na carga da classe.
- `SingletonLazyHolder` - Utiliza o padrão "Initialization-on-demand holder idiom", garantindo lazy loading com segurança em ambiente multithread.

### 🤖 Strategy

Permite a alteração de algoritmos/estratégias em tempo de execução.

Implementações:
- `ComportamentoNormal`
- `ComportamentoDefensivo`
- `ComportamentoAgressivo`

Essas estratégias são aplicadas à classe `Robo`, que pode mudar dinamicamente seu comportamento com base na estratégia configurada.

### 🏛️ Facade

Fornece uma interface simplificada para um conjunto de subsistemas mais complexos.

- Classe `Facade` encapsula operações de cadastro e localização de cliente, abstraindo a complexidade de chamadas a subsistemas internos.

---

## 📚 Referências

* [Digital Innovation One](https://www.dio.me/)
* [Padrões de Projeto - GoF](https://refactoring.guru/pt-br/design-patterns)

---

## 🧑‍💻 Autor

**Júlio César (julioneri)**
Desenvolvedor Full Stack | Entusiasta de boas práticas de código
[GitHub](https://github.com/julioneri)

---

> Este projeto é de caráter educacional e visa apenas demonstrar os conceitos dos padrões de projeto na prática.