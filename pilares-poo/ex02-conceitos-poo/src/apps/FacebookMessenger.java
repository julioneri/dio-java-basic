package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Enviando mensagem pelo Facebook Messenger...");
    }
    
}
