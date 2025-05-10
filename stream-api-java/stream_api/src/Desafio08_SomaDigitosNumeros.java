import java.util.Arrays;
import java.util.List;

public class Desafio08_SomaDigitosNumeros {
    public static void main(String[] args) {
        
        // DESAFIO: Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
        
        // Lista de números para realizar a soma dos dígitos
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista.
        // 2. .reduce(0, Integer::sum): Aplica a soma de todos os números da lista.
        //    - O valor inicial é 0.
        //    - Integer::sum é utilizado para somar os valores no fluxo.
        
        int somaTotal = listaNumeros.stream()
            .reduce(0, Integer::sum);   // Soma todos os números da lista, começando com 0.

        // Exibe o resultado da soma no console
        System.out.println("A soma de todos os dígitos da lista é igual a: " + somaTotal);
    }
}
