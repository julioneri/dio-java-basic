package petmachine;

// Classe que representa a máquina de banho de pets
public class PetMachine {
    private boolean clean = true; // Indica se a máquina está limpa
    private int water = 30; // Quantidade de água disponível
    private int shampoo = 10; // Quantidade de shampoo disponível
    private Pet pet; // Pet atualmente na máquina

    protected Pet getPet() {
        return pet;
    }
    protected void setPet(Pet pet) {
        this.pet = pet;
    }

    // Métodos para verificar e atualizar recursos na máquina
    protected int getWater() {
        return water;
    }
    protected void setWater(int water) {
        this.water = water;
    }
    protected int getShampoo() {
        return shampoo;
    }
    protected void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    // Verifica se há pet na máquina
    protected boolean hasPet() {
        return pet != null;
    }

    // Verifica se o pet está limpo
    protected boolean isClean() {
        return clean;
    }

    // Limpa a máquina
    protected void setClean(boolean newStatus) {
        this.clean = newStatus;
    }
}
