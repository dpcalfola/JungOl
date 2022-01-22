package jungOl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J573 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        printNByN(n);


    }

    private static void printNByN(int n ){
        for (int i = 1; i <= n; i++) {
            for (int j = 1+n*(i-1); j < 1+n*(i-1)+n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
