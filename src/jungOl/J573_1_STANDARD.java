package jungOl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J573_1_STANDARD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        printNByN(n);


    }

    private static void printNByN(int n ){
        int num = 1 ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
