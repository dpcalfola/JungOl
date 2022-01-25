package jungOl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J544 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0 ;

        while(n<=100) {
            sum += n ;
            n++;
        }

        System.out.println(sum);

    }
}
