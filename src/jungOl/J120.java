package jungOl;

import java.util.Scanner;

public class J120 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //입력부
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        //처리부
        int result = Math.abs(num1 - num2);

        //출력부
        System.out.println(result);
    }
}
