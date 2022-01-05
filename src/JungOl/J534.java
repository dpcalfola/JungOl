package JungOl;

import java.util.Scanner;

public class J534 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char c = scan.next().charAt(0);

        switch (c) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Usually");
                break;
            case 'D':
                System.out.println("Effort");
                break;
            case 'F':
                System.out.println("Failure");
                break;
            default:
                System.out.println("error");
        }
    }
}
