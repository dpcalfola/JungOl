package JungOl;

import java.util.Scanner;

public class J515 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int answer1 = number1 * number2 ;
        int answer2 = number1 / number2 ;

        System.out.printf("%d * %d = %d\n", number1, number2, answer1);
        System.out.printf("%d / %d = %d\n", number1, number2, answer2);


    }
}
