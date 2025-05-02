public class ConsoleUtils {
    // Cores ANSI
    public static final String RESET = "\033[0m";
    public static final String BLUE = "\033[34m";
    public static final String GREEN = "\033[32m";
    public static final String RED = "\033[31m";
    public static final String YELLOW = "\033[33m";

    // Sobrecarga do método para aceitar sem o parâmetro 'withNewLine'
    public static void printWithColor(String message, String color) {
        printWithColor(message, color, true);
    }

    // Método que centraliza a lógica de imprimir mensagens com cores
    public static void printWithColor(String message, String color, boolean withNewLine) {
        if (withNewLine) {
            System.out.println(color + message + RESET);
        } else {
            System.out.print(color + message + RESET);
        }
    }
}
