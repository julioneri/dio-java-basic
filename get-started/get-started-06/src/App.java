public class App {
    public static void main(String[] args) throws Exception {
        User pessoa1 = new User();
        pessoa1.setIdade(11);
        pessoa1.setNomeStatic("João Pedro");
        // User.setNomeStatic("João Pedro");

        User pessoa2 = new User();
        pessoa2.setIdade(15);
        pessoa2.setNomeStatic("Maria Flor");
        // User.setNomeStatic("Maria Flor");

        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getNomeStatic());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getNomeStatic());
    }
}
