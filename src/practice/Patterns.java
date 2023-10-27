package practice;

public class Patterns {
    public static void main(String[] args) {

        /* 1 type */
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" "+"*");
            }
            System.out.println();
        }

        /* 2 type */
        for(int i = 0; i < 10; i++) {
            for(int j = 10; j > i; j--) {
                System.out.print(" "+"*");
            }
            System.out.println();
        }

        /* 3 type Pyramid triangle */
        for(int i = 0; i < 10; i++) {
            for(int j = 10-1; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /* 4 type */
        for(int i = 0; i < 10; i++) {
            for(int j = 10; j > i; j--) {
                System.out.print(" ");
            }

            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
