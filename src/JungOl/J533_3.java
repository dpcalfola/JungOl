package JungOl;

import java.util.Scanner;

public class J533_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String gender = scan.next();
        int age = scan.nextInt();
        scan.close();

//        System.out.println(age);
//        System.out.println(gender);

        int gabOfAge = 18 - age;
        boolean repeatChecker = true ;

//        while (repeatChecker){
//
//        }


        if (gabOfAge > 0) {
            if (gender.equals("F")) {
                System.out.println("GIRL");
            } else if (gender.equals("M")) {
                System.out.println("BOY");
            } else {
                System.out.println("성별은 F 또는 M 으로 입력해주세요.");
                repeatChecker = false ;
            }
        } else {
            if (gender.equals("F")) {
                System.out.println("WOMAN");
            } else if (gender.equals("M")) {
                System.out.println("MAN");
            } else {
                System.out.println("성별은 F 또는 M 으로 입력해주세요.");
                repeatChecker = false ;
            }
        }


    }
}
