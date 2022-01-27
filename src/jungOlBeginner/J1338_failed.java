package jungOlBeginner;

import java.util.Scanner;

public class J1338_failed {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        Boolean jumpChecker = false;

        char c = 'A';

        for (int i = 1; i <= n; i++) {

            // 시작 알파벳
            char inChar = (char) (c - 1 + i);
            // 같은 행에서 다음 알파벳까지의 거리의 초기값
            int diff = n - 1;

            //빈칸
            for (int j = 2 * (n - i); j > 0; j--) {
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) {
                // 만약 문자가 'Z' 보다 크다면
                // (inChar % 26) 의 범위는 0~25
                if (inChar > 'Z') {
                    inChar = (char) ('A' + (inChar % 26));
                    jumpChecker = true;
                }

                // n == 5 의 경우 // 5행 'E' 의 다음 문자는 'E'+4 == I  // 그 다음은 'I'+3 == N
                // 같은 행의 문자끼리 거리는 n-1 부터 시작해서 1씩 줄어듬
                System.out.print(inChar + " ");
                if(jumpChecker){
                    inChar += 15;
                    jumpChecker = false;
                }else{
                    inChar = (char) (inChar + diff);
                    diff--;

                }

            }
            System.out.println();

        }

        // 빈칸 만들기
        // 1 - 8개  // i == 1  // n*2-2*i
        // 2 - 6개  // i == 2  // 2(n-i)
        // 4 - 4개  // i == 3

        System.out.println('p'- 'a');
    }


}
