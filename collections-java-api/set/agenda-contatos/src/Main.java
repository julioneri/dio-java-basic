public class Main {
    public static void main(String[] args) throws Exception {
        AgendaConatos agendaContatos = new AgendaConatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Maria", 1234567);
        agendaContatos.adicionarContato("Maria", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila Silva", 67894555);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 7777777));

        agendaContatos.exibirContato();
    }
}
