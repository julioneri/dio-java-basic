import java.util.Arrays;
import java.util.List;

public class Desafio04_RemoveImpares {
    public static void main(String[] args) {

        // DESAFIO: Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

        // Lista de números para aplicar a lógica de filtragem
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista de números.
        // 2. .filter(n -> n % 2 == 0): Filtra os números para manter apenas os pares (aqueles divisíveis por 2).
        // 3. .toList(): Converte o fluxo filtrado em uma lista final contendo apenas os números pares.
        List<Integer> listaPar = listaNumeros.stream()
        .filter(n -> n % 2 == 0)    // Filtra os números pares
        .toList();                  // Converte para uma lista com os números pares

        // Exibe a lista filtrada contendo apenas os números pares
        System.out.println(listaPar);
    }
}
