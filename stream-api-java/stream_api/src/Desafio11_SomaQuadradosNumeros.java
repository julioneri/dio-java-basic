import java.util.Arrays;
import java.util.List;

public class Desafio11_SomaQuadradosNumeros {
    public static void main(String[] args) {

        // DESAFIO: Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

        // Lista de números para realizar o cálculo
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista.
        // 2. .distinct(): Filtra os números para garantir que sejam únicos (sem repetição).
        // 3. .map(n -> n * n): Para cada número, aplica a operação de elevar ao quadrado.
        // 4. .reduce(0, Integer::sum): Soma todos os quadrados, começando com o valor inicial 0.
        
        int somaQuadrados = listaNumeros.stream()
            .distinct()                         // Remove números duplicados para considerar cada número apenas uma vez.
            .map(n -> n * n)                    // Para cada número, calcula o quadrado.
            .reduce(0, Integer::sum);  // Soma os quadrados, começando com 0.

        // Exibe o resultado no console
        System.out.println(somaQuadrados);      // Resultado da soma dos quadrados dos números únicos.
    }
}
