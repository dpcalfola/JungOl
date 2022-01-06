package jungOl;

import java.util.Scanner;

public class J571 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        scan.close();

        J571 exe1 = new J571();

        exe1.print(inputNum);
    }

    void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("~!@#$^&*()_+|");
        }
    }
}
