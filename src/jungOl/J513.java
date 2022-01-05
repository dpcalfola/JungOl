package jungOl;

public class J513 {
    public static void main(String[] args) {

        double unitYd = 91.44;
        double unniIn = 2.54;

        double inputYd = 2.1 ;
        double inputIn = 10.5 ;

        double answer1 = unitYd * inputYd ;
        double answer2 = unniIn * inputIn ;


        System.out.printf(" %.1fyd = %.1fcm\n",inputYd, answer1);
        System.out.printf("%.1fin =  %.1fcm\n",inputIn, answer2);


    }
}
