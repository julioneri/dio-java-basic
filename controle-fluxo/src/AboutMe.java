import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.print("Digite seu nome: ");
            String nome = scanner.next().toUpperCase();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.next().toUpperCase();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo %s %s, tenho %d anos e minha altura é %.2f cm.".formatted(nome, sobrenome,
                    idade, altura));

        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos.");
        }
        scanner.close();
    }
}
