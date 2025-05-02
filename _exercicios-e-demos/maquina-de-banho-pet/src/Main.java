import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    // Instância da máquina de pets
    private final static PetMachine petMachine = new PetMachine();
    
    public static void main(String[] args) {
        // scanner.useDelimiter("\\n");
        var option = -1;

        // Loop de menu até o usuário escolher sair
        do {
            System.out.println("|======= Escolha uma das opções. =======|");
            System.out.println("| 1 - Dar banho no pet                  |");
            System.out.println("| 2 - Abastecer a máquina com água      |");
            System.out.println("| 3 - Abastecer a máquina com shampoo   |");
            System.out.println("| 4 - Verificar água da máquina         |");
            System.out.println("| 5 - Verificar shampo da máquina       |");
            System.out.println("| 6 - Verificar se há pet no banho      |");
            System.out.println("| 7 - Colocar pet na máquina            |");
            System.out.println("| 8 - Retirar pet da máquina            |");
            System.out.println("| 9 - Limpar máquina                    |");
            System.out.println("| 0 - Sair                              |");

            // Lê a opção escolhida
            ConsoleUtils.printWithColor("Digite a opção: ", ConsoleUtils.YELLOW, false);
            option = scanner.nextInt();

            // Executa a ação correspondente à opção
            switch (option) {
                case 1:
                    petMachine.takeAShower(); // Dar banho no pet
                    break;
                case 2:
                    setWater(); // Abastecer a máquina com água
                    break;
                case 3:
                    setShampoo(); // Abastecer a máquina com shampoo
                    break;
                case 4:
                    verifyWater(); // Verificar água
                    break;
                case 5:
                    verifyShampoo(); // Verificar shampoo
                    break;
                case 6:
                    checkIfHasPetInMachine(); // Verificar se há pet
                    break;
                case 7:
                    setPetInPetMachine(); // Colocar pet na máquina
                    break;
                case 8:
                    petMachine.removePet(); // Retirar pet
                    break;
                case 9:
                    petMachine.wash(); // Limpar a máquina
                    break;
                case 0:
                    ConsoleUtils.printWithColor("Saindo... até logo!", ConsoleUtils.GREEN);
                    System.exit(0); // Sair
                    break;
                default:
                    ConsoleUtils.printWithColor("Opção inválida!", ConsoleUtils.RED); // Opção inválida
                    break;
            }
        } while (true);
    }

    // Métodos auxiliares (Abastecer água, shampoo, verificar status etc.)

    private static void setWater() {
        ConsoleUtils.printWithColor("Tentando colocar água na máquina...", ConsoleUtils.YELLOW);
        petMachine.addWater();
    }

    private static void setShampoo() {
        ConsoleUtils.printWithColor("Tentando colocar shampoo na máquina...", ConsoleUtils.YELLOW);
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        var amout = petMachine.getWater();
        ConsoleUtils.printWithColor("A máquina está no momento com " + amout + " litro(s) de água.", ConsoleUtils.GREEN);
    }

    private static void verifyShampoo() {
        var amout = petMachine.getShampoo();
        ConsoleUtils.printWithColor("A máquina está no momento com " + amout + " litro(s) de shampoo.", ConsoleUtils.GREEN);
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        ConsoleUtils.printWithColor(hasPet ? "Há pet na máquina" : "Não há pet na máquina.", hasPet ? ConsoleUtils.GREEN : ConsoleUtils.RED);
    }

    public static void setPetInPetMachine() {
        String name = "";

        while (name == null || name.isEmpty()) {
            ConsoleUtils.printWithColor("Informe o nome do pet: ", ConsoleUtils.YELLOW);
            name = scanner.next();
        }
        Pet pet = new Pet(name);
        petMachine.setPet(pet);
    }
}
