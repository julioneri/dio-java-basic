import java.util.Arrays;
import java.util.List;

public class Desafio12_ProdutoTodosNumeros {
    public static void main(String[] args) {
    
        // DESAFIO: Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

        // Lista de números para calcular o produto
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista.
        // 2. .reduce(1, (valorAtual, proximoValor) -> valorAtual * proximoValor): 
        //    - O método reduce é utilizado para combinar todos os elementos em um único valor (produto, neste caso).
        //    - O valor inicial da operação é 1, porque estamos realizando uma multiplicação e multiplicar por 1 não altera o valor.
        //    - A operação (valorAtual, proximoValor) -> valorAtual * proximoValor realiza a multiplicação entre o valor atual e o próximo valor no fluxo.

        int resultado = listaNumeros.stream()
            .reduce(1, (valorAtual, proximoValor) -> valorAtual * proximoValor);    // Calcula o produto de todos os números na lista

        // Exibe o resultado do produto no console
        System.out.println("O produto de todos os números da lista é igual a : " + resultado);
    }
}
