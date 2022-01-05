package jungOl;

import java.util.Scanner;

public class J110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("yard? ");

        double unitYd = 91.44;

        double inputYd = scan.nextDouble();
        scan.close();

        double resultCm = unitYd * inputYd;


        System.out.printf("%.1fyard = %.1fcm", inputYd, resultCm);
    }
}
