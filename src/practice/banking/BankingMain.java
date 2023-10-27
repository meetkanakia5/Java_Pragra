package practice.banking;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class BankingMain {

    public static void main(String[] args) {

        boolean isBanking = true;
        int whileCounter = 0;

        // declare variables
        double accBal = 1000;

        int timesDeposit = 0;
        double depositAmount = 0;
        double allDeposits[] = new double[timesDeposit+1];

        int timesWithdrawal = 0;
        double withdrawalAmount = 0;
        double allWithdrawals[] = new double[timesDeposit+1];

        Scanner sc = new Scanner(System.in);

        do{
            whileCounter++;

            // messages shown to customer
            System.out.println("1. Check Account Balance");
            System.out.println("2. Make Deposit");
            System.out.println("3. Make Withdrawal");
            System.out.println("4. Account Summary");
            System.out.println("5. Exit");

            // taking an input from messages
            System.out.println("Input the number");
            int input = sc.nextInt();

            // switch to process the input
            switch (input) {
                case 1:
                    System.out.println("Your account bal: $" + accBal);
                break;

                case 2:
                    System.out.println("Enter the deposit amount");
                    depositAmount = sc.nextInt();
                    accBal += depositAmount;
                    System.out.println("New account bal is: " + accBal);
                    timesDeposit++;

                    // this loop will run only when deposit will be called and add all the deposits made -- only possible with arrayList
                    for (int i = timesDeposit; i <= timesDeposit; i++) {
                        allDeposits[timesDeposit-1] += depositAmount;
                    }

                    System.out.println(accBal);
                break;

                case 3:
                break;

                case 4:
                    System.out.println("Summary");
                    System.out.println("Current Bal: $" + accBal);
                    System.out.println("Number of deposits made: " + timesDeposit + ", amount of deposit: $" + Arrays.stream(allDeposits).sum());
                break;

                case 5:
                    System.out.println("Application shutting down");
                    isBanking = false;
                break;
            }

        } while(isBanking);
    }
}