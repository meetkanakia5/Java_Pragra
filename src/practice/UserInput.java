package practice;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you want to input a number?");
        int count = sc.nextInt();

        // taking user input and storing in an array
        int[] numArray = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter "+(i+1)+" number");
            numArray[i] = sc.nextInt();
        }

        // logic for large number
        int largeNumber = 0;
        for (int i = 0; i < numArray.length; i++){
            if(numArray[i] > largeNumber){
               largeNumber = numArray[i];
            }
        }

        System.out.println("Large Number "+largeNumber);
    }
}
