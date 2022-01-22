package jungOl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

    }

}
