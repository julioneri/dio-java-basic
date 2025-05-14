package com.exemplo.notificacao.strategy;

public class SmsStrategy implements NotificationStrategy {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.printf("Enviando SMS para %s: %s\n", destinatario, mensagem);
    }
}