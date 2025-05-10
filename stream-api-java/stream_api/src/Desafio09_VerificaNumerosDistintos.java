import java.util.Arrays;
import java.util.List;

public class Desafio09_VerificaNumerosDistintos {
    public static void main(String[] args) {
        
        // DESAFIO: Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

        // // Lista de números para aplicar a lógica de verificação de números distintos
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista de números.
        // 2. .distinct(): Filtra os números da lista, removendo duplicatas.
        // 3. .count(): Conta a quantidade de números únicos restantes após a remoção de duplicatas.
        // 4. listaNumeros.size(): Obtém o tamanho original da lista, que inclui as duplicatas.
        // 5. A comparação verifica se a quantidade de números distintos é menor que o tamanho da lista, 
        //    indicando a presença de números duplicados.
        boolean resposta = listaNumeros.stream()
            .distinct()             // Filtra os números únicos
            .count()                // Conta a quantidade de números únicos
            < listaNumeros.size();  // Se a quantidade de números únicos for menor que o tamanho da lista original, tem duplicatas

        // Imprime a resposta indicando se existem ou não números duplicados
        System.out.println(resposta ? "Há números duplicados na lista." : "Não há números duplicados na lista");
    }
}
