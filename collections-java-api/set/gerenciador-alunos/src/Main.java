public class Main {
    public static void main(String[] args) throws Exception {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        
        System.out.println(gerenciadorAlunos.removerAluno(120006780L));

        System.out.println("========= Cadastrando Alunos... =========");
        gerenciadorAlunos.adicionarAluno("João", 120006780L, 7);
        gerenciadorAlunos.adicionarAluno("Maria", 000456000L, 8);
        gerenciadorAlunos.adicionarAluno("Maria Souza", 000456000L, 9);
        gerenciadorAlunos.adicionarAluno("Pedro", 10005009L, 8);
        gerenciadorAlunos.adicionarAluno("Pedro", 12340009L, 7);

        System.out.println(gerenciadorAlunos.exibirAlunos());

        System.out.println("========== Alunos Cadastrados! ==========");
        
        System.out.println(gerenciadorAlunos.removerAluno(10005009L));
        System.out.println(gerenciadorAlunos.removerAluno(12345L));

        System.out.println("=========================================");

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorMedia());
    }
}
