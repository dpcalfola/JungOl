package JungOl;

import java.util.Scanner;

public class J555 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[] arrChar = new char[10];

        for (int i = 0; i < arrChar.length; i++) {
            arrChar[i] = scan.next().charAt(0);
        }

        for (int i = 0; i < arrChar.length; i++) {
            System.out.print(arrChar[i]);
        }


    }
}
