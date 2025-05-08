# 🛒 Estoque de Produtos em Java

Este é um projeto simples desenvolvido como parte dos desafios práticos propostos nas aulas sobre **Collections em Java**, disponíveis na plataforma **[DIO - Digital Innovation One](https://www.dio.me/)**. O objetivo é reforçar o uso de **Map** para armazenar e manipular objetos representando produtos em um estoque.

## 🧠 Funcionalidades

* Adicionar produtos com código, nome, quantidade e preço.
* Exibir todos os produtos cadastrados no estoque.
* Calcular o valor total do estoque com base nas quantidades e preços.
* Identificar o produto mais caro do estoque.

## 📦 Estrutura do Projeto

```
src/
├── Main.java               # Classe principal com a execução e testes.
├── Produto.java            # Representa um produto com nome, preço e quantidade.
└── EstoqueProdutos.java    # Gerencia o estoque usando um Map e executa as operações.
```

## 📚 Contexto do Desafio

Este código foi desenvolvido como parte do módulo de **Collections em Java**, com foco em como utilizar **Map** para armazenar objetos com uma chave única (neste caso, o código do produto). O projeto explora a iteração sobre valores do `Map`, cálculo de totais e identificação de maior valor numérico.

## 💡 Como Funciona

* A classe `Produto` armazena `nome`, `preço` e `quantidade`, com `toString()` customizado para facilitar a exibição.
* A classe `EstoqueProdutos` usa um `Map<Long, Produto>` para associar códigos de produto aos objetos.
* O método `calcularValorTotalEstoque()` percorre os produtos e soma `(preço * quantidade)` de cada um.
* O método `obterProdutoMaisCaro()` compara os preços e retorna o produto de maior valor unitário.

## ✅ Exemplo de Saída

```
{}
{1=Produto {nome=Produto A, preco=5.0, quantidade=10}, 2=Produto {nome=Produto B, preco=10.0, quantidade=5}, 3=Produto {nome=Produto C, preco=15.0, quantidade=2}, 4=Produto {nome=Produto D, preco=20.0, quantidade=2}, 5=Produto {nome=Produto E, preco=15.0, quantidade=2}}
Valor ttal do estoque: R$205.0
Produto mais caro: Produto {nome=Produto D, preco=20.0, quantidade=2}
```

## 📌 Observações

* Os produtos são armazenados em um **Map** com chave do tipo `Long` para simular um código identificador único.
* A busca pelo produto mais caro é feita com uma simples comparação sequencial dos preços.
* A lógica de cálculo do valor total considera quantidade e preço de cada item.
