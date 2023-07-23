package july_22.arrays;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input[] = new int[6];

        // Taking value from user.
        for(int i = 0; i < input.length; i++) {
            System.out.println("Enter " + (i+1) + " Value:");
            input[i] = scanner.nextInt();
        }

        // Printing values
        for(int i = 0; i < input.length; i++) {
            System.out.println("Entered Value " + input[i]);
        }
    }
}
