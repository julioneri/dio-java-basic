import java.util.Arrays;
import java.util.List;

public class Desafio03_VerificaNumerosPositivos {
    public static void main(String[] args) {
        
        // DESAFIO: Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

        // Lista de números para verificar a presença de números positivos
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista de números.
        // 2. .allMatch(n -> n > 0): Verifica se todos os números da lista são positivos. Retorna true se todos 
        //    forem positivos (n > 0), caso contrário retorna false.

        boolean resultado = listaNumeros.stream()
        .allMatch(n -> n > 0);          // Verifica se todos os números são positivos

        // Exibe o resultado se todos os números da lista são positivos
        System.out.println("Todos os números da lista são positivos? - " + (resultado ? "Sim" : "Não"));
    }
}
