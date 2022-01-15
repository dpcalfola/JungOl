package jungOl.J614;

import java.util.Scanner;

public class J614 {

    public static void main(String[] args) {
        // student1
        Student stu1 = new Student();
        stu1.setSchoolName("Jejuelementary");
        stu1.setGrade(6);

        // student2
        Student stu2 = new Student();
        Scanner scan = new Scanner(System.in);
        stu2.setSchoolName(scan.next());
        stu2.setGrade(scan.nextInt());
        scan.close();

        // print
        stu1.print();
        stu2.print();
    }

}

class Student {
    private String schoolName;
    private int grade;

    // getter and setter
    // 접근지정자 생략 ==> 같은 패키지 안에서 접근 가능
    String getSchoolName() {
        return schoolName;
    }

    void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    int getGrade() {
        return grade;
    }

    void setGrade(int grade) {
        this.grade = grade;
    }
    //

    // print method
    void print() {
        System.out.printf("%d grade in %s School\n", grade, schoolName);
    }
}

