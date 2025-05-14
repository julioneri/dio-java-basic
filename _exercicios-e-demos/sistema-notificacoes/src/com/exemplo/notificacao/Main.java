package com.exemplo.notificacao;

import com.exemplo.notificacao.config.AppConfig;
import com.exemplo.notificacao.facade.NotificationFacade;
import com.exemplo.notificacao.facade.NotificationFacade.Tipo;

public class Main {
    public static void main(String[] args) {
        // Acessa a configuração global usando o padrão Singleton
        AppConfig config = AppConfig.obterInstancia();
        System.out.println("Ambiente: " + config.obterAmbiente());
        System.out.println("Versão: " + config.obterVersao());

        // Utiliza o padrão Fachada para enviar notificações
        NotificationFacade facade = new NotificationFacade();
        facade.notificar(Tipo.EMAIL, "alice@hotmail.com", "Olá Alice, seu evento foi realizado com sucesso!");
        facade.notificar(Tipo.SMS, "+5511999999999", "Olá Bob, seu evento foi realizado com sucesso!");
    }
}