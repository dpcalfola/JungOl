package jungOl.j199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfPeople = Integer.parseInt(br.readLine());
        ArrayList<Person> peopleList = new ArrayList<>();

        for (int i = 0; i < numOfPeople; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int subject1 = Integer.parseInt(st.nextToken());
            int subject2 = Integer.parseInt(st.nextToken());
            int subject3 = Integer.parseInt(st.nextToken());
            Person p = new Person(name, subject1, subject2, subject3);
            peopleList.add(p);
        }
        br.close();

        Collections.sort(peopleList);

        StringBuilder sb = new StringBuilder();
        for (Person p : peopleList) {
            // chained append()
            sb.append(p.ResultString()).append("\n");
        }

        System.out.println(sb);

    }
}


class Person implements Comparable<Person> {

    private final String name;
    private final int subjectA, subjectB, subjectC;
    private final int totalScore;

    Person(String name, int subjectA, int subjectB, int subjectC) {
        this.name = name;
        this.subjectA = subjectA;
        this.subjectB = subjectB;
        this.subjectC = subjectC;
        this.totalScore = subjectA + subjectB + subjectC;
    }


    String ResultString() {
        return String.format("%s %d %d %d %d", this.name, this.subjectA, this.subjectB, this.subjectC, this.totalScore);
    }


    @Override
    public int compareTo(Person o) {
        // 내림차순 정렬 (역순정렬)
        return (this.totalScore - o.totalScore) * -1;
    }
}
