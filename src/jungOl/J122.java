package jungOl;

import java.util.Scanner;

public class J122 {
    public static void main(String[] args) {

        //
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        scan.close();

        //
        String ly = "leap year";
        String cy = "common year";
        J122 y1 = new J122();

        //
        if (y1.isLy(year)) {
            System.out.println(ly);
        }else{
            System.out.println(cy);
        }

    }

    private boolean isLy(int y) {

        if (y % 400 == 0) {
            return true;
        }
        if (y % 4 == 0 && y % 100 != 0) {
            return true;
        }
        return false;
    }
}
