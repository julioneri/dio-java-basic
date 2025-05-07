

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listaCarrinho;

    public CarrinhoDeCompras() {
        this.listaCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
            return;
        }
        listaCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : listaCarrinho) {
            if (i.getNome().equals(nome)) {
                itensParaRemover.add(i);
            }
        }

        if (itensParaRemover.isEmpty()) {
            System.out.println("Nenhum item com este nome foi encontrado.");
            return;
        }

        listaCarrinho.removeAll(itensParaRemover);
        System.out.println("Todos os itens especificados foram removidos com sucesso!");
    }

    public void exibirItens() {
        for (Item i : listaCarrinho) {
            System.out.println("Item: " + i.getNome() +
                               "\nPreço: " + i.getPreco() +
                               "\nQuantidade: " + i.getQuantidade());
        }
    }
}
