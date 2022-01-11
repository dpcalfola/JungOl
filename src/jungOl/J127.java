package jungOl;

import java.util.ArrayList;
import java.util.Scanner;

public class J127 {
    public static void main(String[] args) {

        // 선언
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0 ;
        double avg = 0;

        // 입력
        while(true) {
            int inputNum = scan.nextInt();
            if (inputNum > 100 || inputNum < 0){
                break;
            }
            list.add(inputNum);
        }
        scan.close();

        // 연산
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        avg = (double) sum / list.size() ;

        // 출력
        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f", avg);
    }
}
