package jungOl;

import java.util.Scanner;

public class J613_1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        student stu = new student();

        stu.setName(scan.next());
        stu.setSchool(scan.next());
        stu.setGrade(scan.nextInt());


        System.out.println("Name : " + stu.getName());
        System.out.println("School : " + stu.getSchool());
        System.out.println("Grade : " + stu.getGrade());

    }
}


class student {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private String name;
    private String school;
    private int grade;

}