import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14_MaiorNumeroPrimo {
    public static void main(String[] args) {
        
        // DESAFIO: Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

        // Lista de números para encontrar o maior número primo
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista.
        // 2. .filter(Desafio14_MaiorNumeroPrimo::ehPrimo): Filtra a lista para incluir apenas os números primos.
        //    - O método `ehPrimo` é chamado para verificar se cada número é primo.
        //    - `ehPrimo` é um método auxiliar que determina se um número é primo (explicado mais abaixo).
        // 3. .max(Integer::compareTo): Após filtrar os números primos, o método `max` encontra o maior número primo.
        //    - `Integer::compareTo` é utilizado para comparar os valores inteiros.

        Optional<Integer> maiorPrimo = listaNumeros.stream()
            .filter(Desafio14_MaiorNumeroPrimo::ehPrimo)    // Filtra os números primos.
            .max(Integer::compareTo);                       // Encontra o maior número primo.

        // .ifPresent(): Verifica se há um valor presente no Optional e, se houver, exibe o maior número primo no console.
        maiorPrimo.ifPresent(primo -> System.out.println("O maior número primo da lista é: " + primo));
    }

    // Método auxiliar para verificar se um número é primo.
    // Um número é primo se for maior que 1 e não for divisível por nenhum número que não seja 1 ou ele mesmo.
    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;                   // Números menores que 2 não são primos.
        
        for(int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;          // Se o número for divisível por qualquer número 
        }                                               // entre 2 e sua raiz quadrada, não é primo.
        
        return true;                                    // Se passar pelas verificações, o número é primo.
    }
}
