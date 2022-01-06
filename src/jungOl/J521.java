package jungOl;

import java.util.Scanner;

public class J521 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = num1++ * --num2;

        System.out.printf("%d %d %d", num1, num2, result);

    }
}
