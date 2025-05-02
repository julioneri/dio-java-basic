import java.util.Scanner;

import petmachine.Pet;
import petmachine.PetMachine;
import petmachine.PetMachineService;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    
    // Instância da máquina de pets
    private final static PetMachine petMachine = new PetMachine();
    private final static PetMachineService petMachineService = new PetMachineService(petMachine);
    
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
            System.out.println("|=======================================|");

            // Lê a opção escolhida
            ConsoleUtils.printWithColor("Digite a opção: ", ConsoleUtils.YELLOW, false);
            option = scanner.nextInt();

            // Executa a ação correspondente à opção
            switch (option) {
                case 1:
                    // Dar banho no pet
                    petMachineService.takeAShower();
                    break;
                case 2:
                    // Abastecer a máquina com água
                    petMachineService.addWater();
                    break;
                case 3:
                    // Abastecer a máquina com shampoo
                    petMachineService.addShampoo();
                    break;
                case 4:
                    // Verificar água
                    ConsoleUtils.printWithColor("A máquina está no momento com " + petMachineService.getWater() + " litro(s) de água.", ConsoleUtils.GREEN);
                    break;
                case 5:
                    // Verificar shampoo
                    ConsoleUtils.printWithColor("A máquina está no momento com " + petMachineService.getShampoo() + " litro(s) de shampoo.", ConsoleUtils.GREEN);
                    break;
                case 6:
                    // Verificar se há pet
                    boolean hasPet = petMachineService.hasPet();
                    ConsoleUtils.printWithColor(hasPet ? "Há pet na máquina" : "Não há pet na máquina.", hasPet ? ConsoleUtils.GREEN : ConsoleUtils.RED);
                    break;
                case 7:
                    // Colocar pet na máquina
                    setPetInPetMachine();
                    break;
                case 8:
                    // Retirar pet
                    petMachineService.removePet();
                    break;
                case 9:
                    // Limpar a máquina
                    petMachineService.washMachine();
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

    public static void setPetInPetMachine() {
        String name = "";

        while (name == null || name.isEmpty()) {
            ConsoleUtils.printWithColor("Informe o nome do pet: ", ConsoleUtils.YELLOW);
            name = scanner.next();
        }
        Pet pet = new Pet(name);
        petMachineService.setPet(pet);
    }
}
