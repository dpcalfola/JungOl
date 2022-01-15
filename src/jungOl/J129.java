package jungOl;

import java.util.Scanner;

public class J129 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.print("Base = ");
            double base = scan.nextDouble();
            System.out.print("Height = ");
            double height = scan.nextDouble();
            double triangleWith = base*height/2;
            System.out.printf("Triangle width = %.1f\n", triangleWith);

            System.out.print("Continue? ");
            String yes = scan.next();

            if(yes.equals("y") || yes.equals("Y")){
                continue;
            }
            break;
        }
    }
}
