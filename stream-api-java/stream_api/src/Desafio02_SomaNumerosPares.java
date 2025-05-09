import java.util.Arrays;
import java.util.List;

public class Desafio02_SomaNumerosPares {
    public static void main(String[] args) {

        // DESAFIO: Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

        // Lista de números para realizar o cálculo
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista de números.
        // 2. .filter(n -> n % 2 == 0): Filtra apenas os números pares da lista.
        // 3. .reduce(0, Integer::sum): Soma os números filtrados. O valor inicial é 0 e a operação de soma é realizada 
        //    com Integer::sum, acumulando a soma dos números pares.
        int resultado = listaNumeros.stream()
            .filter(n -> n % 2 == 0)             // Filtra os números pares
            .reduce(0, Integer::sum);   // Soma os números pares filtrados (inicia com 0)

        // Exibe o resultado da soma dos números pares
        System.out.println("A soma dos números pares é: " + resultado);

        // Alternativa comentada: Outra forma de realizar a soma utilizando mapToInt e sum()
        // 1. .mapToInt(Integer::intValue): Converte os números Integers para primitivos int.
        // 2. .sum(): Realiza a soma de todos os números inteiros filtrados.

        // int resultado = listaNumeros.stream()
        //     .filter(n -> n % 2 == 0)       // Filtra os números pares
        //     .mapToInt(Integer::intValue)    // Converte Integer para int primitivo
        //     .sum();                         // Soma os números filtrados
    }
}
