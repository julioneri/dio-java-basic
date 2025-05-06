package model;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Música tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Tentando ligar para: " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exbindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba.");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}
