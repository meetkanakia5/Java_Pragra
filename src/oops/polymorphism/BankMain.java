package oops.polymorphism;

public class BankMain {
    public static void main(String[] args) {
        Bank scotia = new ScotiaBank(3.5);
        Bank td = new ScotiaBank(2.5);
        System.out.println("scotia interest rate: " + scotia.getIntRate());
        System.out.println("td interest rate: " + td.getIntRate());
    }
}
