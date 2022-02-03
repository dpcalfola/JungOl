package jungOl.j617Copy;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            treeSet.add(new Person(sc.next(), sc.nextInt()));
        }
        sc.close();
        treeSet.first().showInfo();
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void showInfo() {
        System.out.println(name + " " + height);
    }

    @Override
    public int compareTo(Person o) {
        if (height < o.height)
            return -1;
        else if (height == o.height)
            return 0;
        else
            return 1;
    }
}