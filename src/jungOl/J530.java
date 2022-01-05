package jungOl;

import java.util.Scanner;

public class J530 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inputAge = scan.nextInt();

        int gapToAge = 20 - inputAge;

        if (gapToAge > 0) {
            System.out.printf("%d years later", gapToAge);

        } else {
            System.out.println("adult");
        }


    }
}
