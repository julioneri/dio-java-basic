import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio07_SegundoMaiorNumero {
    public static void main(String[] args) {
        
        // DESAFIO: Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

        // Lista de números para aplicar a lógica de filtragem e encontrar o segundo maior número
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista de números.
        // 2. .sorted((a, b) -> b - a): Ordena a lista de forma decrescente, do maior para o menor número.
        // 3. .skip(1): Pula o primeiro número (o maior número da lista).
        // 4. .findFirst(): Obtém o primeiro número restante após pular o maior número, ou seja, o segundo maior número.
        Optional<Integer> numero = listaNumeros.stream()
            .sorted((a, b) -> b - a)    // Ordena a lista de forma decrescente
            .skip(1)                  // Pula o maior número
            .findFirst();               // Pega o primeiro número restante (segundo maior)

        // Imprimindo o segundo maior número
        // O método ifPresentOrElse verifica se o número existe.
        // Caso o número exista, ele será impresso no console.
        // Caso não exista (por exemplo, se a lista tiver menos de dois números), uma mensagem é exibida.
        numero.ifPresentOrElse(
            System.out::println,        // Se o segundo maior número existir, imprime
            () -> System.out.println("Não há segundo amior número")); // Se não existir, exibe uma mensagem
    }
}
