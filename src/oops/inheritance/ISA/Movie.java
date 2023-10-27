package oops.inheritance.ISA;

public class Movie {
    private String movieName;
    private int releaseYear;

    public Movie(String movieName, int releaseYear) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
    }

    public void getDetails() {
        System.out.println("Name : " + movieName);
        System.out.println("Year : " + releaseYear);
    }
}
