package oops.encapsulation;

public class ScotiaBank extends Bank{

    private String accouhtHolderName;
    private String accountType;
    private String accountNumber;
    private double accountBalance;

    ScotiaBank(String accouhtHolderName, String accountType, String accountNumber, double accountBalance, String bankName) {
        super(accouhtHolderName, accountType, accountNumber, accountBalance);
        System.out.println("Bank Name: " + bankName);
    }


}
