public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS", "PEDRO"};

        // for(int x = 0; x<alunos.length; x++) {
        //     System.out.println("O aluno de índice " + x + " é " + alunos[x]);
        // }

        for(String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
