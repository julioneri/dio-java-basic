public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total d elementos na lista é: " + listaTarefa.oberNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa nº 1");
        listaTarefa.adicionarTarefa("Tarefa nº 1");
        listaTarefa.adicionarTarefa("Tarefa nº 3");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.oberNumeroTotalTarefas());
        
        listaTarefa.removerTarefa("Tarefa nº 1");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.oberNumeroTotalTarefas());
        
        listaTarefa.obterDescricoesTarefas();
        
    }
}
