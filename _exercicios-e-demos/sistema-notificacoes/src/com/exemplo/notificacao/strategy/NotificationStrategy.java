package com.exemplo.notificacao.strategy;

public interface NotificationStrategy {
    void enviar(String destinatario, String mensagem);
}