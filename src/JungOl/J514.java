package JungOl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J514 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("height = ");

        int h = Integer.parseInt(br.readLine());

        System.out.printf("Your height is %dcm.",h);
    }
}
