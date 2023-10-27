package oops.inheritance.ISA;

import oops.inheritance.ISA.Movie;

public class TollyWood extends Movie {

    private int fights;
    private String genre;

    TollyWood(String movieName, int releaseYear, String genre, int fights) {
        super(movieName, releaseYear);
        this.genre = genre;
        this.fights = fights;
    }

    public void getTollyWoodDetails() {
        getDetails();
        System.out.println("Genre : " + this.genre);
        System.out.println("Fights : " + this.fights);
    }
}
