import model.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        
        iphone.selecionarMusica("Heavy Metal Lover - Lady Gaga");
        iphone.tocar();
        
        iphone.ligar("(00) 98765-4321");
        iphone.atender();
        
        iphone.exibirPagina("github.com/julioneri");
        iphone.atualizarPagina();
    }
}
