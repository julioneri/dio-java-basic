public record Person(String name, int age) {

    // Construtor compactado (útil para validações futuras)
    public Person {
        // Pode-se adicionar validações aqui, se necessário
    }
    // Sobrecarga: define idade padrão como 1
    public Person(String name) {
        this(name, 1);
    }

    // Método personalizado para exibir informações formatadas
    public String getInfo() {
        return "Name: " + name + " | Age: " + age;
    }
}
