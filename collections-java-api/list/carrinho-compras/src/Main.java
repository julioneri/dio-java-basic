public class Main {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adicionarItem("Biscoito", 3, 5);
        carrinho.adicionarItem("Café", 13, 1);
        carrinho.adicionarItem("Arroz", 17, 1);

        carrinho.exibirItens();

        System.out.println("=================");

        carrinho.removerItem("Feijão");
        carrinho.removerItem("Biscoito");

        System.out.println("=================");

        carrinho.exibirItens();
    }
}
