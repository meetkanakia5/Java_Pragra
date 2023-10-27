package oops.inheritance.ISA;

import oops.inheritance.ISA.Vehicle;

public class MainInheritance {
    public static void main(String[] args) {
        Vehicle.Car car = new Vehicle.Car("Sedan", "Volvo", 85000);
        car.getCarValues();
    }
}
