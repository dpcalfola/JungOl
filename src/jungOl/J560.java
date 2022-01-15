package jungOl;

import java.util.Scanner;

public class J560 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        for (int i : arr) {
            min = Math.min(min, i);
        }

        System.out.println(min);
    }
}
