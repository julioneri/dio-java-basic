public class User {
    private static String nomeStatic;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public static String getNomeStatic() {
        return nomeStatic;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void setNomeStatic(String nomeStatic) {
        User.nomeStatic = nomeStatic;
    }
}
