package JungOl;

import java.util.Scanner;

public class J538 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = 0 ;


        boolean repeatChecker = true ;

        while (repeatChecker){

            number = scan.nextInt();
            if (number < 0){
                System.out.println("negative number");
            }else if (number > 0){
                System.out.println("positive integer");
            }else{
                repeatChecker = false ;
            }

        }




    }
}
