package level1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1. addition, 2. Subtraction, 3. Modulus");
        int input = sc.nextInt();

        System.out.println("Enter 1 number");
        int a = sc.nextInt();

        System.out.println("Enter 2 number");
        int b = sc.nextInt();

        if(input == 1) {
            System.out.println("Sum of 2 integers: " + (a+b));
        }

        if(input == 2) {
            System.out.println("Sub of 2 integers: " + (a-b));
        }

        if(input == 3) {
            System.out.println("Mod of 2 integers: " + (a%b));
        }
    }
}