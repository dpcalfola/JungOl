package jungOl;


// 통과된 코드입니다.

import java.util.Scanner;

public class J558 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 길이가 100인 배열 선언. 선언시 초기값은 모두 0이므로 초기화 작없은 생략
        int[] arr = new int[100];

        // inputValue: 임시저장소로 사용
        int inputValue = 0;
        int arrCounter = -1;

        for (int i = 0; i < arr.length; i++) {

            // 입력값을 임시저장소에 저장
            inputValue = scan.nextInt();

            // 0이 입력될 경우 반복문 탈출
            if (inputValue == 0) {
                break;
            }

            // 입력받은 값을 배열 0 인덱스부터 저장
            arr[i] = inputValue;

            // 입력 받을 때부터 카운터 1씩 증가. 카운터의 초기값은 -1. 첫번째 입력 받았을 때 카운터값은 0이 됨
            // 카운터값 == 인덱스값
            arrCounter++;
        }

        scan.close();

        // 반복문 시작점의 i값 == 마지막으로 들어온 값의 인덱스값
        // 인덱스값이 0이 될때까지 (배열의 첫 값까지) i 값을 1씩 감소시킴
        for (int i = arrCounter; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
