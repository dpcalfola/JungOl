package JungOl;

import java.util.Scanner;

public class J555_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] arrChar = new char[10];
        String str = scan.nextLine();
        scan.close();

        for (int i = 0; i < arrChar.length; i++) {
            arrChar[i] = str.charAt(2 * i);
        }
        for (int i = 0; i < arrChar.length; i++) {
            System.out.print(arrChar[i]);
        }
    }
}
