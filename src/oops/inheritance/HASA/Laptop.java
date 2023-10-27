package oops.inheritance.HASA;

public class Laptop {

    private String usage;
    private String name;

    private int price;

    Laptop(String usage, String name, int price) {
        this.usage = usage;
        this.name = name;
        this.price = price;
    }

    public void LaptopDetails() {
        System.out.println("usage: " + usage);
        System.out.println("name: " + name);
        System.out.println("price: " + price);
    }
}
