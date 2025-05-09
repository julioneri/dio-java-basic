import java.util.Arrays;
import java.util.List;

public class Desafio01_OrdenaNumeros {
    public static void main(String[] args) {

        // DESAFIO: Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.

        // Lista de números para ordenar
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista.
        // 2. .sorted(): Ordena os números em ordem crescente.
        // 3. .toList(): Converte o fluxo de volta para uma lista após a ordenação.
        List<Integer> listaOrdenada = listaNumeros.stream()
        .sorted()           // Ordena os números de forma crescente.
        .toList();          // Converte o fluxo ordenado de volta para uma lista.

        // Exibe cada número da lista ordenada no console.
        listaOrdenada.forEach(System.out::println);
    }
}
