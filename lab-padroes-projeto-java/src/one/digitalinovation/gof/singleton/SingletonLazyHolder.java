package one.digitalinovation.gof.singleton;

public class SingletonLazyHolder {
    
    // Construtor privado impede instâncias externas
    private SingletonLazyHolder() {
        super();
    }

    // Classe interna estática só é carregada quando chamada
    private static class instanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    // Método de acesso à instância
    public static SingletonLazyHolder getInstancia() {
        return instanceHolder.instancia;
    }
}
