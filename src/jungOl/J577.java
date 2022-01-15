package jungOl;

import java.util.Scanner;

public class J577 {
    public static void main(String[] args) {
        J577 j1 = new J577();

        Scanner scan = new Scanner(System.in);
        j1.n1 = scan.nextInt();
        j1.n2 = scan.nextInt();
        scan.close();
        j1.execute();

        System.out.println(j1.n1 + " " + j1.n2);

    }

    int n1 = 0;
    int n2 = 0;

    private void execute() {
        if (n1 > n2) {
            n1 /= 2;
            n2 *= 2;
        } else {
            n1 *= 2;
            n2 /= 2;
        }

    }
}
