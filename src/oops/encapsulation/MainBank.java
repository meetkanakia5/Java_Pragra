package oops.encapsulation;

public class MainBank {
    public static void main(String[] args)  {
        ScotiaBank sb = new ScotiaBank("Meet K", "Savings", "123456789", 1000.00, "Scotia Bank");
        System.out.println(sb.getAccHolderName());
        sb.setAccHolderName("Meet Kanakia");
        try {
            sb.setWithdraw(5000);
        } catch (NotSufficientBalanceException e) {
            throw new RuntimeException(e);
        }
        sb.setDeposit(50);

        // name change
        System.out.println(sb.getAccHolderName());
        try {
            sb.setWithdraw(500);
        } catch (NotSufficientBalanceException e) {
            throw new RuntimeException(e);
        }
        sb.setDeposit(900);

    }
}
