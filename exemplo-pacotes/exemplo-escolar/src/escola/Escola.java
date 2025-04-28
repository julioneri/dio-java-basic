package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        
        felipe.setNome("Felipe");
        felipe.setIdade(9);
        
        String mensagem = String.format("O aluno %s tem %d anos.", felipe.getNome(), felipe.getIdade());
        System.out.println(mensagem);
    }
}
