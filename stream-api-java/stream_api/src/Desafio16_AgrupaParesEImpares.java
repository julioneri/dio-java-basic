import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16_AgrupaParesEImpares {
    public static void main(String[] args) {

        // DESAFIO: Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.

        // Lista base com números inteiros.
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Cria uma lista contendo apenas os números pares.
        // Utiliza filter para selecionar os números divisíveis por 2
        List<Integer> numerosPares = listaNumeros.stream()
            .filter(n -> n % 2 == 0)
            .toList();

        // Cria uma lista contendo apenas os números ímpares.
        // Utiliza filter para selecionar os números que não são divisíveis por 2.
        List<Integer> numerosImpares = listaNumeros.stream()
            .filter(n -> n % 2 != 0)
            .toList();

        // Exibe separadamente os números pares e ímpares obtidos acima.
        System.out.println("Números pares da lista: " + numerosPares);
        System.out.println("Números ímpares da lista: " + numerosImpares);
        
        // ================================================

        // Agora agrupa os números em um Map utilizando groupingBy.
        // A chave booleana `true` representa os números pares (n % 2 == 0).
        // A chave `false` representa os números ímpares.
        Map<Boolean, List<Integer>> numerosListados = listaNumeros.stream()
            .collect(Collectors.groupingBy(n -> n % 2 == 0));
        
        System.out.println("===========================================");

        // Exibe os números pares acessando a chave `true` do Map.
        System.out.println("Números pares da lista: " + numerosListados.get(true));

        // Exibe os números ímpares acessando a chave `false` do Map.
        System.out.println("Números ímpares da lista: " + numerosListados.get(false));

        System.out.println("===========================================");

        // Exibe o Map completo, mostrando a separação entre pares (true) e ímpares (false).
        System.out.println("Números ímpares da lista: " + numerosListados);
        
    }
}
