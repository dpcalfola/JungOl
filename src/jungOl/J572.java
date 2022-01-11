package jungOl;

import java.util.Scanner;

public class J572 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        scan.close();

        double area = areaOfACircle(r);
        System.out.printf("%.2f", area);
    }

    private static double areaOfACircle(double r) {
        double pie = 3.14;
        return r * r * pie;
    }
}
