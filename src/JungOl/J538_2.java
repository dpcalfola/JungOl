package JungOl;

import java.util.Scanner;

public class J538_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        double aver = 0;
        int i = 0;

        while (true) {

            if (number < 100) {

                number = sc.nextInt();
                sum = sum + number;
                i++;


            } else {
                aver = (double) sum / i;
                System.out.println(sum);
                System.out.printf("%.1f", aver);
                break;

            }
        }
        sc.close();


    }
}

// ????