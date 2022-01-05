package jungOl;

import java.util.Scanner;

public class J633 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean whileEscaper = true;

        while (whileEscaper) {
            System.out.println("1. Korea\n" + "2. USA\n" + "3. Japan\n" + "4. China");
            System.out.println("number?");
            int numOfNation = scan.nextInt();
            switch (numOfNation) {
                case 1:
                    System.out.println("Seoul");
                    break;
                case 2:
                    System.out.println("Washington");
                    break;
                case 3:
                    System.out.println("Tokyo");
                    break;
                case 4:
                    System.out.println("Beijing");
                    break;
                default:
                    System.out.println("none");
                    whileEscaper = false;
                    //
                    // default 자리에 break 를 넣었을 때 switch 문만 빠져나갑니다.
                    // 이중 break 처럼 반복문까지 탈출 할 수 있는 break 를 사용 가능한지요?
            }
            scan.close();
            System.out.println();
        }
    }
}
