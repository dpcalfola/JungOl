package jungOl;

import java.util.Scanner;

public class J593 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("ASCII code =? ");
            int input = scan.nextInt();
            if (input < 33 || input > 127) {
                break;
            }
            char c = (char) input;
            System.out.println(c);
        }

    }
}
