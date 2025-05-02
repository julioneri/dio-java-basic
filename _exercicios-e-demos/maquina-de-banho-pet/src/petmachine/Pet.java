package petmachine;

// Classe que representa o pet
public class Pet {
    private final String name; // Nome do pet
    private boolean clean; // Estado de limpeza do pet

    // Construtor para inicializar o pet com nome e estado de limpeza
    public Pet(String name) {
        this.name = name;
        this.clean = false; // Inicialmente o pet não está limpo
    }

    // Métodos de acesso ao nome e estado de limpeza do pet
    protected String getName() {
        return name;
    }

    protected boolean isClean() {
        return clean;
    }

    protected void setClean(boolean clean) {
        this.clean = clean; // Atualiza o estado de limpeza do pet
    }
}
