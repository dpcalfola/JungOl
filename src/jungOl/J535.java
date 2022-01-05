package jungOl;

import java.util.Scanner;

public class J535 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = (int) scan.nextDouble();
        scan.close();

        String result = "";

        switch (score) {
            case 4:
                result = "scholarship";
                break;
            case 3:
                result = "next semester";
                break;
            case 2:
                result = "seasonal semester";
                break;
            default:
                result = "retake";
        }
        System.out.println(result);
    }
}
