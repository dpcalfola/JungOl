package jungOlBeginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i+n*j + " ");
            }
            System.out.println();
        }

    }
}
