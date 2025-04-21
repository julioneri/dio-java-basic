public class SmartTv {
    boolean status=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        status=true;
    }

    public void desligar(){
        status=false;
    }

    public void aumentarVolume() {
        if (status && volume<100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (status && volume>0) {
            volume--;  
        }
    }

    public void mudarCanal(int canal) {
        if (status) {
            this.canal = canal;
        }
    }
    
    public void aumentarCanal() {
        if (status) {
            canal++;
        }
    }
    
}
