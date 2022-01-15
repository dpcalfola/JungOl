package jungOl;

import java.util.Scanner;

public class J1291_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;

        // 입력
        while (true) {
            n1 = scan.nextInt();
            n2 = scan.nextInt();
            if ((n1 > 9 || n1 < 2) || n2 > 9 || n2 < 2) {
                System.out.println("INPUT ERROR!");
            } else {
                break;
            }
        }
        scan.close();

        for (int i = 1; i < 10; i++) {

            if (n1 < n2) {
                for (int j = n1; j <= n2; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println();
            } else {
                for (int j = n1; j >= n2; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println();
            }

        }
    }
}
