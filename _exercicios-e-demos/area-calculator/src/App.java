import java.util.Scanner;

public class App {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int option = -1;
        GeometricForm geometricForm;

        while (true) {
            System.out.println("Esclha a forma geometrica para calcular a área.");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair do programa");
            System.out.print("Digite: ");
            option = scanner.nextInt();

            if (option == 1) {
                geometricForm = createSquare();
            }
            else if (option == 2) {
                geometricForm = createRectangle();
            }
            else if (option == 3) {
                geometricForm = creatCircle();
            }
            else if (option == 4) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Opção inválida");
                continue;
            }

            System.out.println("O resultado do cálculo da area foi de " + geometricForm.getArea());
        }
    }

    private static GeometricForm createSquare() {
        System.out.print("Informe o tamanho dos lados: ");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle() {
        System.out.print("Informe a altura: ");
        var height = scanner.nextDouble();
        System.out.print("Informe a base: ");
        var base = scanner.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm creatCircle() {
        System.out.print("Informe o raio: ");
        var radio = scanner.nextDouble();
        return new Circle(radio);
    }
}
