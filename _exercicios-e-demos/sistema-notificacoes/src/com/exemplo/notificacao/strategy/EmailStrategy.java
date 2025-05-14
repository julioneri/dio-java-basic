package com.exemplo.notificacao.strategy;

public class EmailStrategy implements NotificationStrategy {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.printf("Enviando email para %s: %s\n", destinatario, mensagem);
    }
}