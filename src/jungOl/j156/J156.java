package jungOl.j156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (true) {
            int inputNum = Integer.parseInt(st.nextToken());

            if (inputNum == 999) {
                break;
            }

            if(inputNum < minValue){
                minValue = inputNum;
            }
            if(inputNum > maxValue){
                maxValue = inputNum;
            }
        }

        System.out.println("max : " + maxValue);
        System.out.println("min : " + minValue);
    }
}
