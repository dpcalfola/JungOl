package jungOl;

import java.util.Scanner;

public class J533_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        char gender = scan.next().charAt(0); // char 타입으로 입력 받는 방법 !!

        String gender = scan.next();
        int age = scan.nextInt();
        scan.close();

        char genderChar = gender.charAt(0);
        int gabOfAge = 20 - age;

//        System.out.println(age);
//        System.out.println(genderChar);

        if (gabOfAge > 0) {
            if (genderChar == 'F') {
                System.out.println("GIRL");
            } else {
                System.out.println("BOY");
            }
        } else {
            if (genderChar == 'F') {
                System.out.println("WOMAN");
            } else {
                System.out.println("MAN");
            }
        }


    }
}
