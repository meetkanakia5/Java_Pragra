package oops.encapsulation;

public class Bank {
    private String accountHolderName;
    private String accountType;
    private String accountNumber;
    private double accountBalance;
    private double balance;

    Bank(String accountHolderName, String accountType, String accountNumber, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccHolderName() {
        return "Welcome " + accountHolderName;
    }

    public void setAccHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        getAccHolderName();
    }
    public void setWithdraw (double withdrawAmount) throws NotSufficientBalanceException {
        balance = accountBalance - withdrawAmount; //-4000
        if(balance > 0) {
            accountBalance -= withdrawAmount;
            getBalance();
        } else {
            throw new NotSufficientBalanceException("Insufficient balance");
        }
    }
    public void setDeposit(double depositAmount) {
        accountBalance += depositAmount;
        getBalance();
    }
    public void getBalance() {
        System.out.println("Account Balance: $" + accountBalance);
    }



    public void statements() {}
}
