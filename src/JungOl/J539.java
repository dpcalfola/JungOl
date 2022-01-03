package JungOl;

import java.util.Scanner;

public class J539 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int numCounter = 0;
        double avg = 0;

        while (true) {
            inputNum = scan.nextInt();

            if (inputNum >= 100) {
                sum += inputNum;
                numCounter++ ;
                break;
            }
            sum += inputNum;
            numCounter++;
        }
        scan.close();

        avg = (double) sum / numCounter;

        System.out.println(sum);
        System.out.printf("%.1f\n", avg);
    }
}
