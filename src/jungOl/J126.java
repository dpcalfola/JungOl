package jungOl;

import java.util.Scanner;

public class J126 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int odd = 0;
        int even = 0;

        while (true) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        scan.close();

        System.out.printf("odd : %d\n", odd);
        System.out.printf("even : %d\n", even);
    }
}
