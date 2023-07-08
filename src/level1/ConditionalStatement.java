package level1;
import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number");
        int num = scan.nextInt();
        if(num == 1) {
            System.out.println("1");
        } else {
            System.out.println("you typed: " + num);
        }
    }
}
