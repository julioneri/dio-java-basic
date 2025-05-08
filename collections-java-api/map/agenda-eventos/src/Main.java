import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) throws Exception {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.DECEMBER, 25), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2030, Month.JANUARY, 1), "Evento 5", "Atração 5");

        agendaEventos.exibirAgenda();

        System.out.println("=================");
        agendaEventos.obterProximoEvento();
        //System.out.println(LocalDate.now());
    }
}
