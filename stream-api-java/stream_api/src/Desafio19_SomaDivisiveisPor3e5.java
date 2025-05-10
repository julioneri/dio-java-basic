import java.util.Arrays;
import java.util.List;

public class Desafio19_SomaDivisiveisPor3e5 {
    public static void main(String[] args) {
        
        // DESAFIO: Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

        // Criação de uma lista de números inteiros.
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utiliza a Stream API para filtrar os números que são divisíveis por 3 e por 5.
        // O filtro é feito verificando se o número é divisível por 3 e por 5 ao mesmo tempo (usando o operador lógico "&&").
        int somaTotal = listaNumeros.stream()
            .filter(num -> num % 3 == 0 && num % 5 == 0)    // Filtra apenas os números divisíveis por 3 e 5
            .reduce(0, Integer::sum);              // Realiza a soma dos números filtrados. O valor inicial é 0.
        
        // Exibe o resultado da soma no console.
        System.out.println("A soma dos números da lista divisíveis por 3 e 5 é: " + somaTotal);
    }
}
