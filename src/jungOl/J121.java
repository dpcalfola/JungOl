package jungOl;

import java.util.Scanner;

public class J121 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.close();

        if (n > 0) {
            System.out.println("plus");
        }else if (n == 0){
            System.out.println("zero");
        }else{
            System.out.println("minus");
        }
    }
}
