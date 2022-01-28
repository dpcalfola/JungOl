package jungOl;

import java.io.IOException;
import java.util.Scanner;

public class J564 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        // 알파벳의 번지수를 갖는 배열 생성
        int[] alphabet = new int[26];

        // 입력
        while (true) {
            char c = scan.next().charAt(0);

            // 대문자 알파벳 이외 입력시 while문 탈출
            if (c > 'Z' || c < 'A') {
                break;
            }

            int diff = (int) c - 65;
            // 'A' 가 입력 될 경우 diff == 0
            // 'B' 가 입력 될 경우 diff == 1

            // 배열 값을 1씩 증가
            alphabet[diff]++;
        }

        // 출력
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                char outputChar = (char) (i + 65);
                System.out.println(outputChar + " : " + alphabet[i]);
            }
        }

    }
}
