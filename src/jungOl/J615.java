package jungOl;

import java.util.Scanner;

public class J615 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 선언
        J615 stu1 = new J615();
        J615.score stu1Score = stu1.new score();
        J615 stu2 = new J615();
        J615.score stu2Score = stu2.new score();

        // 입력
        stu1.name = scan.next();
        stu1Score.koLanguage = scan.nextInt();
        stu1Score.english = scan.nextInt();
        stu2.name = scan.next();
        stu2Score.koLanguage = scan.nextInt();
        stu2Score.english = scan.nextInt();
        scan.close();

        // 연산
        int avgKo = (stu1Score.koLanguage + stu2Score.koLanguage) / 2;
        int avgEn = (stu1Score.english + stu2Score.english) / 2;

        // 출력
        System.out.printf("%s %d %d\n", stu1.name, stu1Score.koLanguage, stu1Score.english);
        System.out.printf("%s %d %d\n", stu2.name, stu2Score.koLanguage, stu2Score.english);
        System.out.printf("avg %d %d\n", avgKo, avgEn);


    }

    // field
    String name;

    // inner class
    class score {
        int koLanguage;
        int english;
    }
}
