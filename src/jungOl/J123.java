package jungOl;

import java.util.Scanner;

public class J123 {
    public static void main(String[] args) {
        System.out.println("Number?");

        Scanner scan = new Scanner(System.in);
        int animal = scan.nextInt();
        scan.close();

        switch (animal){
            case 1 :
                System.out.println("dog");
                break;
            case 2 :
                System.out.println("cat");
                break;
            case 3 :
                System.out.println("chick");
                break;
            default:
                System.out.println("I don't know.");
        }

    }
}
