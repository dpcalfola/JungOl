package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<Integer, String> country = new HashMap<>();
        country.put(1, "Korea");
        country.put(2, "USA");
        country.put(3, "Japan");
        country.put(4, "China");

        HashMap<Integer, String> capital = new HashMap<>();
        capital.put(1, "Seoul");
        capital.put(2, "Washington");
        capital.put(3, "Tokyo");
        capital.put(4, "Beijing");

        while (true) {
            for (int i = 1; i <= 4; i++) {
                System.out.printf("%d. %s\n", i, country.get(i));
            }
            System.out.print("number? ");
            int inputNum = scan.nextInt();

            if (inputNum < 1 || inputNum > 4) {
                System.out.println("\nnone");
                break;
            } else {
                System.out.printf("\n%s\n\n", capital.get(inputNum));
            }
        }
    }
}
