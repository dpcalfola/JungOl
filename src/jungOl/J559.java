package jungOl;

import java.util.Scanner;

public class J559 {
    public static void main(String[] args) {
        double[] avgArr = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};

        Scanner scan = new Scanner(System.in);

        // 입력받은 값과 배열의 인덱스를 일치시키기 위해 -1 씩 더함
        int class1 = scan.nextInt() - 1;
        int class2 = scan.nextInt() - 1;

        double sum = avgArr[class1] + avgArr[class2];

        System.out.printf("%.1f", sum);


    }
}
