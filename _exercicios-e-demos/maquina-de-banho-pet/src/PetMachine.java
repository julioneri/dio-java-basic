// Classe que representa a máquina de banho de pets
public class PetMachine {
    private boolean clean = true; // Indica se a máquina está limpa
    private int water = 30; // Quantidade de água disponível
    private int shampoo = 10; // Quantidade de shampoo disponível
    private Pet pet; // Pet atualmente na máquina

    // Método para dar banho no pet, verificando se há pet e recursos suficientes
    public void takeAShower() {
        if (!hasPet()) {
            ConsoleUtils.printWithColor("É necessário um pet na máquina para iniciar o banho.", ConsoleUtils.RED);
            return;
        }

        if (getWater() < 10 || getShampoo() < 2) {
            ConsoleUtils.printWithColor("Não há água ou shampoo suficiente para banhar o pet.", ConsoleUtils.RED);
            return;
        }

        this.water -= 10; // Reduz a quantidade de água
        this.shampoo -= 2; // Reduz a quantidade de shampoo

        pet.setClean(true); // Marca o pet como limpo
        ConsoleUtils.printWithColor("O pet " + pet.getName() + " agora está limpo!", ConsoleUtils.GREEN);
    }

    // Métodos para adicionar água e shampoo
    public void addWater() {
        if (water >= 30) {
            ConsoleUtils.printWithColor("A capacidade de água da máquina está no máximo.", ConsoleUtils.GREEN);
            return;
        }

        water += 2; // Adiciona água
    }

    public void addShampoo() {
        if (shampoo >= 10) {
            ConsoleUtils.printWithColor("A capacidade de shampoo da máquina está no máximo.", ConsoleUtils.GREEN);
            return;
        }
            
        shampoo += 2; // Adiciona shampoo
    }

    // Métodos para verificar recursos na máquina
    public int getWater() { return water; }
    public int getShampoo() { return shampoo; }

    // Verifica se há pet na máquina
    public boolean hasPet() { return pet != null; }

    // Coloca um pet na máquina
    public void setPet(Pet pet) {
        if (!this.clean) {
            ConsoleUtils.printWithColor("A máquina está suja, para colocar o pet é necessário limpa-la.", ConsoleUtils.RED);
            return;
        }
        if (hasPet()) {
            ConsoleUtils.printWithColor("O pet " + this.pet.getName() + " está na máquina neste momento.", ConsoleUtils.GREEN);
            return;
        }

        this.pet = pet;
        ConsoleUtils.printWithColor("O pet " + pet.getName() + " foi colocado na máquina.", ConsoleUtils.GREEN);
    }

    // Retira um pet da máquina
    public void removePet() {
        this.clean = this.pet.isClean();
        ConsoleUtils.printWithColor("O pet " + this.pet.getName() + " foi retirado da máquina!", ConsoleUtils.GREEN);
        this.pet = null;
    }

    // Limpa a máquina, se houver água suficiente
    public void wash() {
        if (getWater() > 10) {
            this.water -= 10;
            this.clean = true;
            ConsoleUtils.printWithColor("A máquina foi limpa!", ConsoleUtils.GREEN);
        } else {
            ConsoleUtils.printWithColor("Não há água suficiente para lavar a máquina.", ConsoleUtils.RED);
        }
    }
}
