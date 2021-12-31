package JungOl;

import java.util.Scanner;

public class J528 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNum = scan.nextInt();

        if (inputNum < 0) {
            System.out.printf("%d\nminus", inputNum);
        }else {
            System.out.println(inputNum);
        }

    }
}
