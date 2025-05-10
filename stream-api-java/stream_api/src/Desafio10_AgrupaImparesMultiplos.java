import java.util.Arrays;
import java.util.List;

public class Desafio10_AgrupaImparesMultiplos {
    public static void main(String[] args) {
        
        // DESAFIO: Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

        // Lista de números para aplicar a lógica de filtragem
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista.
        // 2. .filter(n -> (n % 3 == 0 || n % 5 == 0) && n % 2 != 0): Filtra os números que são múltiplos de 3 ou 5, 
        //    e garante que são ímpares (n % 2 != 0).
        // 3. .distinct(): Remove números duplicados, garantindo que cada número apareça apenas uma vez.
        // 4. .toList(): Converte o fluxo filtrado em uma lista de resultados.
        
        List<Integer> MultiplosDe3e5 = listaNumeros.stream()
            .filter(n -> (n % 3 == 0 || n % 5 == 0) && n % 2 != 0)  // Filtra os números múltiplos de 3 ou 5 que são ímpares
            .distinct()                                             // Remove duplicatas da lista
            .toList();                                              // Converte para uma lista final

        // Verifica se a lista de múltiplos de 3 e 5 não está vazia
        if (!MultiplosDe3e5.isEmpty()) {
            System.out.println("Os números múltiplos de 3 ou de 5 da lista são: " + MultiplosDe3e5);
        } else {
            System.out.println("Não há números múltiplos de 3 ou 5 a lista.");
        }
    }
}
