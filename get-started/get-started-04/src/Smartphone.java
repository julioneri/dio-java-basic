public class Smartphone implements MusicPlayer, VideoPlayer{

    @Override
    public void playVideo() {
        System.out.println("O smartphone está tocando o vídeo...");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone está pausando o vídeo...");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphone está parando o vídeo...");
    }

    @Override
    public void playMusic() {
        System.out.println("O smartphone está tocando a música...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está pausando a música...");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone está parando a música...");
    }
    
}
