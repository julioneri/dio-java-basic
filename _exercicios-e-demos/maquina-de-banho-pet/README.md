# 🐾 PetMachine - Simulador de Banho para Pets

Este é um projeto simples em Java que simula o funcionamento de uma máquina de banho para pets. O usuário pode interagir com a máquina através de um menu no terminal, abastecendo com água e shampoo, colocando e retirando um pet, e realizando o banho.

## 🧠 Funcionalidades

- Dar banho no pet (consome água e shampoo).
- Abastecer a máquina com água e shampoo.
- Verificar níveis de água e shampoo.
- Verificar se há um pet dentro da máquina.
- Colocar ou remover um pet da máquina.
- Lavar/limpar a máquina.
- Evita ações incorretas, como dar banho sem recursos ou com a máquina suja.

## 📦 Estrutura do Projeto

```
src/
├── Main.java           # Classe principal, contém o menu de interação.
├── Pet.java            # Representa o pet com nome e status de limpeza.
└── PetMachine.java     # Representa a máquina de banho e sua lógica.
```

## 🧼 Regras da Máquina

- A máquina começa com 30 litros de água e 10 litros de shampoo.
- Cada banho consome 10 litros de água e 2 de shampoo.
- A máquina precisa estar limpa para aceitar um novo pet.
- Só é possível colocar um pet se não houver outro.
- A limpeza da máquina consome 10 litros de água.

## 📌 Observações

- O código foi escrito para fins didáticos.
- Nenhuma persistência de dados é implementada.
- Ideal para quem está estudando os conceitos de orientação a objetos.
