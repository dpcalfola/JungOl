package jungOl;

import java.util.Scanner;

public class J632_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        int min = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }

        System.out.println(min);
    }
}
