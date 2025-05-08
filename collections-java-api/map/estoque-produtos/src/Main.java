public class Main {
    public static void main(String[] args) throws Exception {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 15.0);
        estoqueProdutos.adicionarProduto(4L, "Produto D", 2, 20.0);
        estoqueProdutos.adicionarProduto(5L, "Produto E", 2, 15.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor ttal do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
