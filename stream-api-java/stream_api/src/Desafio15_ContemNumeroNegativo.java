import java.util.Arrays;
import java.util.List;

public class Desafio15_ContemNumeroNegativo {
    public static void main(String[] args) {
        
        // DESAFIO: Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

        // Lista de números para verificar a presença de números negativos.
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista.
        // 2. .anyMatch(n -> n < 0): Verifica se algum número na lista é negativo.
        //    - O método `anyMatch` retorna verdadeiro assim que encontra um número negativo.
        //    - A expressão `n -> n < 0` é uma condição que verifica se o número é menor que 0 (negativo).
        // 3. O resultado será um valor booleano (true ou false) indicando se há algum número negativo na lista.

        boolean resultado = listaNumeros.stream()
            .anyMatch(n -> n < 0);  // Verifica se existe algum número negativo na lista.
        

        // A expressão ternária (resultado ? "Sim" : "Não") é usada para exibir "Sim" se `resultado` for true, e "Não" se for false.
        System.out.println("Há algum número negativo na lista? - " + (resultado ? "Sim" : "Não"));
    }
}
