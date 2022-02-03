package jungOl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        br.close();

        double avg = (double) sum / n;
        String passFail = avg >= 80 ? "pass" : "fail";

        System.out.printf("avg : %.1f\n", avg);
        System.out.println(passFail);
    }
}
