package jungOl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }


        int multiplesOfThreeCount = 0;
        int multiplesOfFiveCount = 0;

        for (int num : nums) {
            if (num % 3 == 0) {
                multiplesOfThreeCount++;
            }
            if (num % 5 == 0) {
                multiplesOfFiveCount++;
            }
        }

        System.out.println("Multiples of 3 : " + multiplesOfThreeCount);
        System.out.println("Multiples of 5 : " + multiplesOfFiveCount);

    }
}
