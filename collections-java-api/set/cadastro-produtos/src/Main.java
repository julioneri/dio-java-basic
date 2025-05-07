public class Main {
    public static void main(String[] args) throws Exception {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);
        cadastroProdutos.adicionarProduto(5L, "Produto 1", 5d, 7);

        System.out.println(cadastroProdutos.exibirTodosOsProdutos());
        System.out.println("=================");

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("=================");

        System.out.println(cadastroProdutos.exibirPodutosPorPreco());
    }
}
