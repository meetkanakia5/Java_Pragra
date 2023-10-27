package oops.abstraction;

public abstract class MediaPlayer {

    MediaPlayer(String player) {
        System.out.println("Player: " + player);
    }
    public abstract void play();
    public abstract String pause();

}
