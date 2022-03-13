package jungOl.j133;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J133 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfInput = Integer.parseInt(br.readLine());
        int[] nums = new int[numOfInput];

        StringTokenizer st = new StringTokenizer(br.readLine() , " ");
        for (int i = 0; i < numOfInput; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 배열의 합을 구하는 함수
        int sum = Arrays.stream(nums).sum();
        //


        double avg = (double) sum / numOfInput ;
        System.out.printf("%.2f", avg);

    }
}
