import java.util.Arrays;
import java.util.List;

public class Desafio17_FiltraNumerosPrimos {
    public static void main(String[] args) {
        
        // DESAFIO: Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

        // Criação de uma lista de números inteiros.
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtra apenas os números primos da lista utilizando a Stream API.
        // Para isso, utiliza o método auxiliar 'ehPrimo' como referência de método.
        List<Integer> numerosPrimos = listaNumeros.stream()
            .filter(Desafio17_FiltraNumerosPrimos::ehPrimo)
            .toList();

        // Exibe no console a lista de números primos encontrados.
        System.out.println("A lista de números primos é: " + numerosPrimos);
    }

    // Método auxiliar para verificar se um número é primo.
    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;                        // Números menores que 2 não são primos.
        
        for(int i = 2 ; i <= Math.sqrt(numero) ; i++ ) { 
            if (numero % i == 0) return false;               // Se o número for divisível por qualquer número
        }                                                    // entre 2 e sua raiz quadrada, não é primo.
        
        return true;                                         // Se nenhum divisor foi encontrado, o número é primo.
    }
}
