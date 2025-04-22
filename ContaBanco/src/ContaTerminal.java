import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir mensagem para o usuário
        System.out.print("Por favor, digite o número da Conta: ");
        //Obter pela scanner os valor digitado no terminal
        int numero = scanner.nextInt();

        System.out.print("Digite o número da Agência: ");
        String numAgencia = scanner.next();

        scanner.nextLine();

        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o Saldo: ");
        Double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.", nomeCliente, numAgencia, numero, saldo);
        System.out.println(mensagem);
        scanner.close();
    }
}
