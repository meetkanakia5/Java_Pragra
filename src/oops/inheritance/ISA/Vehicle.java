package oops.inheritance.ISA;

public class Vehicle {

    private String type;
    private String company;
    private int amount;

    public Vehicle(String type, String company, int amount) {
        this.type = type;
        this.company = company;
        this.amount = amount;
    }

    public void valuesOfProperties() {
        System.out.println("type " + type);
        System.out.println("company " + company);
        System.out.println("amount $" + amount);
    }

    public static class Car extends Vehicle {
        public Car(String type, String company, int amount) {
            super(type, company, amount);
        }

        public void getCarValues() {
            valuesOfProperties();
        }
    }
}
