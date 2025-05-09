import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */

public class ConsumerExample {
    public static void main(String[] args) throws Exception {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        /*
        // Usar o Consumer com expressão lambda para imprimir números pares

        Consumer<Integer> imprimirNumeroPar = numero -> {
          if (numero % 2 == 0) {
            System.out.println(numero);
          }  
        };

        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);

                    |
                    v

        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        });

                    |
                    v
        
        numeros.stream().forEach(n -> {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        );

                    |
                    v
                    
        */

        numeros.forEach(n -> {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        );

        System.out.println("=====================");

        List<String> listaNomes = Arrays.asList("João", "Maria", "Steffani");

        listaNomes.forEach(nomes -> {
            System.out.println(nomes);
        });

        System.out.println("=====================");

        listaNomes.forEach(System.out::println);

        System.out.println("=====================");

        // Exemplo com Predicate
        numeros.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        // Forma de iterar sobre a lista e imprimir apenas os nomes que começam com "M"
        // listaNomes.stream()
        //     .filter(nome -> nome.startsWith("M"))
        //     .forEach(System.out::println);

    }
}
