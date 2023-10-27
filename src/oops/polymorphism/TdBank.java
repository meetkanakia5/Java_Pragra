package oops.polymorphism;

public class TdBank extends Bank{
    private double interestRate;

    TdBank(double interestRate) {
        super(interestRate);
        this.interestRate = interestRate;
    }
}
