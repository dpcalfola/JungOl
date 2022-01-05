package jungOl;

import java.util.Scanner;

public class J538_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = 0;
        boolean repeatChecker = true;

        while (repeatChecker) {

            System.out.print("number? ");

            number = scan.nextInt();
            if (number < 0) {
                System.out.println("\nnegative number");
            } else if (number > 0) {
                System.out.println("\npositive integer");
            } else {
                repeatChecker = false;
            }

        }

    }
}
