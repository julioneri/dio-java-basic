public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Status atual: " + (smartTv.status ? "Ligada" : "Desligada"));
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("===============================");
        smartTv.ligar();
        smartTv.mudarCanal(11);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Status atual: " + (smartTv.status ? "Ligada" : "Desligada"));
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("===============================");
        smartTv.desligar();
        smartTv.mudarCanal(9);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Status atual: " + (smartTv.status ? "Ligada" : "Desligada"));
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
