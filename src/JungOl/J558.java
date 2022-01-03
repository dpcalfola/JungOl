package JungOl;

import java.util.Scanner;

public class J558 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int[] arr = new int[100];
        int inputValue = 0;
        int arrCounter = -1;

        for (int i = 0; i < arr.length; i++) {

            inputValue = scan.nextInt();

            if (inputValue == 0) {
                break;
            }

            arr[i] = inputValue;
            arrCounter++;
        }

        for (int i = arrCounter; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
