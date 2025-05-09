import java.util.Arrays;
import java.util.List;

public class Desafio05_MediaMaioresQueCinco {
    public static void main(String[] args) {
        
        // DESAFIO: Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

        // Lista de números para realizar o cálculo
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista de números.
        // 2. .filter(n -> n > 5): Filtra os números que são maiores que 5.
        // 3. .mapToDouble(Integer::intValue): Converte cada número de Integer para double para permitir o cálculo da média.
        // 4. .average(): Calcula a média dos números filtrados.
        // 5. .orElse(0.0): Se não houver nenhum número maior que 5, retorna 0.0 como valor padrão.
        double media = listaNumeros.stream()
            .filter(n -> n > 5)                 // Filtra números maiores que 5
            .mapToDouble(Integer::intValue)     // Converte Integer para double
            .average()                          // Calcula a média
            .orElse(0.0);                 // Retorna 0.0 se não houver elementos

        // Exibe o resultado da média dos números maiores que 5
        System.out.println("A média dos números maiores que 5 é: " + media);
    }
}
