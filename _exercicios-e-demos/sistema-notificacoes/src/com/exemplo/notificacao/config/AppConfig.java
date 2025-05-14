package com.exemplo.notificacao.config;

public class AppConfig {
    private static volatile AppConfig instance;
    private final String ambiente;
    private final String versao;

    private AppConfig(String ambiente, String versao) {
        this.ambiente = ambiente;
        this.versao = versao;
    }

    public static AppConfig obterInstancia() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig("Produção", "1.0");
                }
            }
        }
        return instance;
    }

    public String obterAmbiente() {
        return ambiente;
    }

    public String obterVersao() {
        return versao;
    }
}