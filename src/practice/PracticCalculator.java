package practice;
import java.util.Scanner;


public class PracticCalculator {
    public static void main(String[] args) {
        boolean whileInput = true;

        do{
            System.out.println("1. Add");
            System.out.println("2. Exit program");

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your input to continue");
            int input = sc.nextInt();

            int num1 = 0;
            int num2 = 0;

            if(input != 2) {
                System.out.println("Enter 1 number");
                num1 = sc.nextInt();

                System.out.println("Enter 2 number") ;
                num2 = sc.nextInt();
            }

            switch (input) {
                case 1:
                    System.out.println("addition: " + (num1 + num2));
                    break;
                case 2:
                    whileInput = false;
                    break;
            }

        } while(whileInput);
    }
}
