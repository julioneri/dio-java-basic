public class SistemaCadastro {
    public static void main(String[] args) throws Exception {
        Pessoa marcos = new Pessoa("", "123456789-00");
        
        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }

}
