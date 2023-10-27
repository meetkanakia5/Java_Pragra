package oops.inheritance.ISA;

public class MovieMain {
    public static void main(String[] args) {
        Bollywood bw = new Bollywood("Drishyam2",2021, "Crime Thriller");
        Movie tw = new TollyWood("Bahubali", 2015, "Action", 50);
        bw.getBollyWoodDetails();

    }
}
