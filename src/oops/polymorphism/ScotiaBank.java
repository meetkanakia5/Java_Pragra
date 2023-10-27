package oops.polymorphism;

public class ScotiaBank extends Bank{
    private double interestRate;

    ScotiaBank(double interestRate) {
        super(interestRate);
        this.interestRate = interestRate;
    }
}
