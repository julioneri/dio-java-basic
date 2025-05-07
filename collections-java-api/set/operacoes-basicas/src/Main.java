public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println(
                "Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 12345);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 12345);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 67890);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 13579);

        System.out.println("===========================");
        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(13579);
        System.out.println("===========================");

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        conjuntoConvidados.exibirConvidados();
    }
}
