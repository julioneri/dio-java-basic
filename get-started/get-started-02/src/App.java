public class App {
    public static void main(String[] args) {
        // Cria uma pessoa com nome e idade padrão (1)
        var person = new Person("João");

        // Exibe informações formatadas
        System.out.println(person.getInfo());

        // Exibe apenas o nome
        System.out.println(person.name());

        // Cria nova pessoa com nome e idade específica
        var newPerson = new Person(person.name(), 13);

        // Exibe saída padrão do record
        System.out.println(newPerson);
    }
}
