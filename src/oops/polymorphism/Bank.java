package oops.polymorphism;

public class Bank {
    private double interestRate;

    Bank(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getIntRate() {
        return interestRate;
    }
}
