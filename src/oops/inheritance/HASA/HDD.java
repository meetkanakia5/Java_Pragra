package oops.inheritance.HASA;

import oops.inheritance.HASA.Laptop;

public class HDD {

    private int storageCap;
    private Laptop laptop;

    HDD(int storageCap, Laptop laptop) {
        this.storageCap = storageCap;
        this.laptop = laptop;
    }

    public void HddDetails() {
        System.out.println("storage capacity: " + storageCap);
        laptop.LaptopDetails();
    }
}
