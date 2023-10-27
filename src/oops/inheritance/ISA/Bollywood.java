package oops.inheritance.ISA;

public class Bollywood extends Movie {
    private String genre;

    public Bollywood(String movieName, int releaseYear, String genre) {
        super(movieName, releaseYear);
        this.genre = genre;
    }

    public void getBollyWoodDetails() {
        getDetails();
        System.out.println("Genre : " + this.genre);
    }

}

