package oops.abstraction;

public class VlcMediaPlayer extends MediaPlayer{

    VlcMediaPlayer(String player) {
        super(player);
    }

    public void play() {

    }

    public String pause() {
        return "Vlc video player Stopped";
    }
}
