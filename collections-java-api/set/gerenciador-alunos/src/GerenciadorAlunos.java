import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet();
    }

    // Adiciona um aluno ao conjunto.
    public void adicionarAluno(String nome, Long matricula, double media) {
        listaAlunos.add(new Aluno(nome, matricula, media));
    }

    // Remove um aluno ao conjunto a partir da matricula, se estiver presente.
    public String removerAluno(long matricula) {
        if (listaAlunos.isEmpty()) {
            return "Não há alunos cadastrados.";
        }
        
        Aluno alunoParaRemover = null;
        for(Aluno a : listaAlunos) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }

        if (alunoParaRemover != null) {
            listaAlunos.remove(alunoParaRemover);
            return "Aluno " + matricula + " removido com sucesso!";
        }
        return "Nenhum aluno com a matrícula informada foi encontrado.";
    }

    // Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        return alunosPorNome;
    }

    // Exibe todos os alunos do conjunto em ordem crescente de nota.
    public Set<Aluno> exibirAlunosPorMedia() {
        Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatorPorMedia());
        alunosPorMedia.addAll(listaAlunos);
        return alunosPorMedia;
    }

    // Exibe todos os alunos do conjunto.
    public Set<Aluno> exibirAlunos() {
        return listaAlunos;
    }
}
