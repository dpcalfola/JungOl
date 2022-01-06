package jungOl;

import java.util.Scanner;

public class J125 {

    J125() {
    }

    void printCounter(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
        }
    }

    void printNegativeCounter(int n) {
        for (int i = 1; i >= n; i--) {
            System.out.printf("%d ", i);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        J125 exe1 = new J125();

        if (n >= 1) {
            exe1.printCounter(n);
        } else {
            exe1.printNegativeCounter(n);
        }
    }
}
