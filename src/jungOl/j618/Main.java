package jungOl.j618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = 5;
        LinkedList<Person> personLinkedList = new LinkedList<>();

        for (int i = 0; i < caseNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());

            personLinkedList.add(new Person(name, height, weight));
        }


        // sort name
        personLinkedList.sort(Comparator.comparing(Person::getName));
        System.out.println("name");
        for (Person p : personLinkedList) {
            System.out.println(p.getName() + " " + p.getHeight() + " " + p.getWeight());
        }

        // sort weight
        System.out.println("\nweight");
        personLinkedList.sort((o1, o2) -> (int) (o2.getWeight()*10 - o1.getWeight()*10));
        for (Person p : personLinkedList){
            System.out.println(p.getName() + " " + p.getHeight() + " " + p.getWeight());
        }


    }

}

class Person {

    private String name;
    private int height;
    private double weight;


    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}