package jungOl;

import java.util.Scanner;

public class J1303 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();

        for (int i = 1; i <= x * y; i++) {
            if (i % y == 0) {
                System.out.print(i + "\n");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
