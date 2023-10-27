package oops.abstraction;

public class MediaPlayerMain {
    public static void main(String[] args) {
        VlcMediaPlayer vlc = new VlcMediaPlayer("Video");
        vlc.play();
        System.out.println(vlc.pause());
    }
}
