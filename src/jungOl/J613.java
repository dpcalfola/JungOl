package jungOl;

import java.util.Scanner;

public class J613 {

    static class student {
        String name;
        String school;
        int grade;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        student stu = new student();

        stu.name = scan.next();
        stu.school = scan.next();
        stu.grade = scan.nextInt();

        System.out.println("Name : " + stu.name);
        System.out.println("School : " + stu.school);
        System.out.println("Grade : " + stu.grade);


    }
}
