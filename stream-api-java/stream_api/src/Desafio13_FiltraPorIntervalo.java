import java.util.Arrays;
import java.util.List;

public class Desafio13_FiltraPorIntervalo {
    public static void main(String[] args) {
        
        // DESAFIO: Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

        // Lista de números para filtrar os valores dentro do intervalo entre 5 e 10
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista.
        // 2. .filter(n -> n > 5 && n < 10): Filtra os números para incluir apenas aqueles que são maiores que 5 e menores que 10.
        //    - A expressão lambda n -> n > 5 && n < 10 verifica se o número está dentro do intervalo entre 5 e 10 (exclusivo).
        // 3. .toList(): Coleta os números filtrados e os coloca em uma nova lista.

        List<Integer> numerosFiltrados = listaNumeros.stream()
            .filter(n -> n > 5 && n < 10)       // Filtra os números no intervalo entre 5 e 10 (exclusivo).
            .toList();                          // Coleta os resultados filtrados em uma lista.

        // Exibe os números filtrados que estão dentro do intervalo no console
        System.out.println("Os números entre 5 e 10 da lista são: " + numerosFiltrados);
    }
}
