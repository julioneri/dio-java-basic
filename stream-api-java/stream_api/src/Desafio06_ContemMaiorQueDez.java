import java.util.Arrays;
import java.util.List;

public class Desafio06_ContemMaiorQueDez {
    public static void main(String[] args) {
        
        // DESAFIO: Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

        // Lista de números para verificar a presença de números maiores que 10
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API:
        // 1. .stream(): Cria um fluxo de dados a partir da lista de números.
        // 2. .anyMatch(n -> n > 10): Verifica se algum número da lista é maior que 10.
        // 3. .anyMatch() retorna um valor booleano: 'true' se algum número atender à condição, 'false' caso contrário.
        boolean resposta = listaNumeros.stream()
            .anyMatch(n -> n > 10);         // Verifica se há algum número maior que 10 na lista

        // Exibe o resultado da verificação
        System.out.println("A lista possui algm número maior que 10? - " + (resposta ? "Sim" : "Não"));
    }
}
