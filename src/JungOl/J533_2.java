package JungOl;

import java.util.Scanner;

public class J533_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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
