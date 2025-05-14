package com.exemplo.notificacao.facade;

import com.exemplo.notificacao.strategy.NotificationStrategy;
import com.exemplo.notificacao.strategy.EmailStrategy;
import com.exemplo.notificacao.strategy.SmsStrategy;

public class NotificationFacade {
    public enum Tipo { EMAIL, SMS }

    public void notificar(Tipo tipo, String destinatario, String mensagem) {
        NotificationStrategy strategy;
        switch (tipo) {
            case EMAIL:
                strategy = new EmailStrategy();
                break;
            case SMS:
                strategy = new SmsStrategy();
                break;
            default:
                throw new IllegalArgumentException("Tipo não suportado: " + tipo);
        }
        strategy.enviar(destinatario, mensagem);
    }
}