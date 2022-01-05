package jungOl;

import java.util.Scanner;

public class J632 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] n = new int[3];

        for (int i = 0; i < n.length; i++) {
            n[i] = scan.nextInt();
        }
        scan.close();

        int min = Integer.MAX_VALUE ;

        if (n[0] <= n[1]) {
            min = n[0];
        }else{
            min = n[1];
        }

        if (min <= n[2]){
        }else{
            min = n[2];
        }

        System.out.println(min);
    }
}
