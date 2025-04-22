import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.print("Ola, me chamo " + nome + " " + sobrenome);
        System.out.print(" e tenho " + idade + " anos. ");
        System.out.print("Minha altura é " + altura + "cm.");

        scanner.close();
    }
}
