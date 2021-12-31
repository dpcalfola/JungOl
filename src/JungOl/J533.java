package JungOl;

import java.util.Scanner;

public class J533 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String gender = scan.next();
        int age = scan.nextInt();
        scan.close();

//        System.out.println(age);
//        System.out.println(gender);

        int gabOfAge = 20 - age;


        if (gabOfAge > 0) {
            if (gender.equals("F")) {
                System.out.println("GIRL");
            } else {
                System.out.println("BOY");
            }
        } else {
            if (gender.equals("F")) {
                System.out.println("WOMAN");
            } else {
                System.out.println("MAN");
            }
        }


    }
}
