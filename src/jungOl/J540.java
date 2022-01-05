package jungOl;

import java.util.Scanner;

public class J540 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int inputNum = scan.nextInt();
            if (inputNum == -1) {
                break;
            } else if (inputNum % 3 != 0) {
            } else {
                System.out.println(inputNum / 3);
            }
        }
        scan.close();
    }
}
