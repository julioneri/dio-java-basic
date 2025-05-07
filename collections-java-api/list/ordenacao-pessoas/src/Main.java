public class Main {
    public static void main(String[] args) throws Exception {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.57);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.57);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("=======================================");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
