package jungOl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int sum = 0;
        int count = 0;
        for (int i = 1; sum < n; i += 2) {
            sum += i;
            count++;
        }

        System.out.print(count + " " + sum);
    }
}
