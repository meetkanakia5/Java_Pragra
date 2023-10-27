package practice;

import java.util.Scanner;
public class Consonants {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] consonants = { 'B', 'C', 'D', 'F', 'G', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'S', 'T', 'V', 'X', 'Z' };
        System.out.println("Enter a character");
        char consonantInput = sc.next().charAt(0);
        for(int i = 0; i < consonants.length; i++){
            if(consonants[i] == consonantInput) {
                System.out.println(consonantInput+" is consonant");
                break;
            } else {
                System.out.println("Not a consonant");
                break;
            }
        }
    }
}
