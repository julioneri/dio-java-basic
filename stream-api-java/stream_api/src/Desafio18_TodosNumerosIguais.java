import java.util.Arrays;
import java.util.List;

public class Desafio18_TodosNumerosIguais {
    public static void main(String[] args) {
        
        // DESAFIO: Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

        // Criação de uma lista de números inteiros.
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifica se todos os números da lista são iguais.
        // 1. O método `distinct()` retorna os números únicos da lista (removendo duplicatas).
        // 2. A contagem (`count()`) de números únicos deve ser 1 se todos os números forem iguais.
        boolean resposta = listaNumeros.stream()
            .distinct()                                 // Remove números duplicados da lista
            .count() == 1;                              // Se restar apenas um número, todos os números são iguais

        /*
         *
         * Outra forma comentada de verificar (não usada neste código):
         * O código abaixo verifica se todos os números são iguais ao primeiro número da lista.
         * 
         * boolean resposta = listaNumeros.stream()
         * .allMatch(n -> n.equals(numeros.get(0))); 
         * 
        */

        // Exibe no console se todos os números são iguais.
        System.out.println("Todos os números da lista são iguais? - "  + (resposta ? "Sim" : "Não"));
    }
}
