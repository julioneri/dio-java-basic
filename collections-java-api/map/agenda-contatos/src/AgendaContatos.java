import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaCotatoMap;

    public AgendaContatos() {
        this.agendaCotatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaCotatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaCotatoMap.isEmpty()) {
            agendaCotatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaCotatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaCotatoMap.isEmpty()) {
            numeroPorNome = agendaCotatoMap.get(nome);
        }
        return numeroPorNome;
    }
}
