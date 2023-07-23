package level1;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Switch");
        String input = sc.nextLine();

        switch(input) {
            case "Toronto":
                System.out.println("CN Tower");
                break;

            case "London":
                System.out.println("Fanshawe college");
                break;

            default:
                System.out.println("Input not found");
                break;
        }

    }
}
