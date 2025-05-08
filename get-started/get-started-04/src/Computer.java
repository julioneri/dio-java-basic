public class Computer implements MusicPlayer, VideoPlayer{

    @Override
    public void playVideo() {
        System.out.println("O computador está tocando o vídeo...");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador está pausando o vídeo...");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computador está parando o vídeo...");
    }

    @Override
    public void playMusic() {
        System.out.println("O computador está tocando a música...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador está pausando a música...");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador está parando a música...");
    }
}
