package oops.inheritance.HASA;

import oops.inheritance.HASA.HDD;
import oops.inheritance.HASA.Laptop;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Gaming", "Ace", 1000);
        HDD hdd = new HDD(1000, laptop);
        hdd.HddDetails();
    }
}
