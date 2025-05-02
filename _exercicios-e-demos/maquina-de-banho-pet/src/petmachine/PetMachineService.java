package petmachine;

public class PetMachineService {
    PetMachine petMachine;

    public PetMachineService(PetMachine petMachine) {
        this.petMachine = petMachine;
    }

    // Método para dar banho no pet, verificando se há pet e recursos suficientes
    public void takeAShower() {
        if (!hasPet()) {
            System.out.println("É necessário um pet na máquina para iniciar o banho.");
            return;
        }

        if (getWater() < 10 || getShampoo() < 2) {
            System.out.println("Não há água ou shampoo suficiente para banhar o pet.");
            return;
        }

        petMachine.setWater(getWater() - 10); // Reduz a quantidade de água
        petMachine.setShampoo(getShampoo() - 2); // Reduz a quantidade de shampoo

        petMachine.getPet().setClean(true); // Marca o pet como limpo
        System.out.println("O pet " + petMachine.getPet().getName() + " agora está limpo!");
    }

    // Métodos para adicionar água e shampoo
    public void addWater() {
        if (getWater() >= 30) {
            System.out.println("A capacidade de água da máquina está no máximo.");
            return;
        }

        petMachine.setWater(getWater() + 2); // Adiciona água
    }

    public void addShampoo() {
        if (getShampoo() >= 10) {
            System.out.println("A capacidade de shampoo da máquina está no máximo.");
            return;
        }
            
        petMachine.setShampoo(getShampoo() + 2); // Adiciona shampoo
    }

    // Coloca um pet na máquina
    public void setPet(Pet pet) {
        if (!petMachine.isClean()) {
            System.out.println("A máquina está suja, para colocar o pet é necessário limpa-la.");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + petMachine.getPet().getName() + " está na máquina neste momento.");
            return;
        }

        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

    // Retira um pet da máquina
    public void removePet() {
        if (!hasPet()) {
            System.out.println("Não há pet na máquina para remover");
            return;
        }

        petMachine.setClean(petMachine.getPet().isClean());
        System.out.println("O pet " + petMachine.getPet().getName() + " foi retirado da máquina!");
        petMachine.setPet(null);
    }

    // Limpa a máquina, se houver água suficiente
    public void washMachine() {
        if (getWater() < 10) {
            System.out.println("Não há água suficiente para lavar a máquina.");
            return;
        }

        petMachine.setWater(getWater() - 10);
        petMachine.setClean(true);
        System.out.println("A máquina foi limpa!");
    }

    public int getWater() {
        return petMachine.getWater();
    }

    public int getShampoo() {
        return petMachine.getShampoo();
    }

    public boolean hasPet() {
        return petMachine.hasPet();
    }
}
