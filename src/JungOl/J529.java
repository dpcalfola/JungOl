package JungOl;

import java.util.Scanner;

public class J529 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int height = scan.nextInt();
        int weight = scan.nextInt();

        int obesityValue = weight + 100 - height;

        System.out.println(obesityValue);

        if (obesityValue > 0) {
            System.out.println("Obesity");
        }

//        System.out.println(Integer.MAX_VALUE);


    }
}
