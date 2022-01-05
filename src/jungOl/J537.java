package jungOl;

import java.util.Scanner;

public class J537 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int sum = 0;

        int counter = 0 ;

        while ( counter <= number){
            sum += counter ;
            counter++;
        }



        System.out.println(sum);

    }
}
