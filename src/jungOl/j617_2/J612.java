package jungOl.j617_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class J612 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Person> peopleList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            peopleList.add(new Person(name, height));
        }

        peopleList.sort(new myComparator());

        Iterator<Person> ii = peopleList.iterator();
        Person smallPerson = ii.next();
        System.out.println(smallPerson.getName() + " " + smallPerson.getHeight());
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

class myComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return (o1.getHeight() - o2.getHeight());
    }
}





/*
Park 175
Lee 180
Choo 185
Son 193
Kim 1


 */