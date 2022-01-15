package jungOl;

import java.util.Scanner;

public class J1856 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();


        int[][] ttArray = new int[x][y];

        // make array
        for (int i = 0; i < ttArray.length; i++) {
            for (int j = 0; j < ttArray[0].length; j++) {
                ttArray[i][j] = (j + 1) + (i * y);
            }
        }

        // print
        for (int i = 0; i < ttArray.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < ttArray[0].length; j++) {
                    System.out.print(ttArray[i][j] + " ");
                }
            } else {
                for (int j = ttArray[0].length - 1; j >= 0; j--) {
                    System.out.print(ttArray[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
