package jungOl;

import java.util.Scanner;

public class J128 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.MIN_VALUE;
        int cnt = 0;

        while (true) {
            input = scan.nextInt();
            if (input == 0) {
                break;
            } else if (input % 3 != 0 && input % 5 != 0) {
                cnt++;
            }
        }
        scan.close();
        System.out.println(cnt);
    }
}
