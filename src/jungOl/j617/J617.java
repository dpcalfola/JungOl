package jungOl.j617;

import java.util.Scanner;

public class J617 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Person[] people = new Person[5];

        // 입력
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(scan.next(), scan.nextInt());
        }
        scan.close();

        // 가장 작은 키를 찾는다
        int smallHeight = Integer.MAX_VALUE;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getHeight() < smallHeight) {
                smallHeight = people[i].getHeight();
            }
        }

        // 가장 작은 키를 가진 사람을 찾아 이름과 키를 출력한다.
        for (Person p : people) {
            if (p.getHeight() == smallHeight) {
                System.out.println(p.getName() + " " + p.getHeight());
            }
        }

    }
}

class Person {

    private String name;
    private int height;

    Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

}
