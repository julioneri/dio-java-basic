public class Main {
    public static void main(String[] args) throws Exception {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Maria", 1234567);
        agendaContatos.adicionarContato("Maria", 5678901);
        agendaContatos.adicionarContato("Maria João", 1111111);
        agendaContatos.adicionarContato("Maria Silva", 7654321);
        agendaContatos.adicionarContato("João Lucas", 1111111);
        agendaContatos.adicionarContato("Maria", 7777777);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("João Lucas"));
    }
}
