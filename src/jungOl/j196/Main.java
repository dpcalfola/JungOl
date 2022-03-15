package jungOl.j196;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받는 사람의 수
        int inputCaseNum = 3;

        // Person 객체를 생성하여 리스트에 담는다.
        ArrayList<Person> personList = new ArrayList<>();
        for (int i = 0; i < inputCaseNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Person p1 = new Person(st.nextToken(), st.nextToken(), st.nextToken());
            personList.add(p1);
        }
        br.close();

        // personList 를 이름순으로 정렬한다
        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // 정렬된 리스트에서 가장 앞에 있는 객체를 담아 출력
        Person fastPerson = personList.get(0);
        fastPerson.printPersonInfo();

    }
}

class Person {

    // final 붙인 이유: IDE 가 final 붙인 코드를 추천합니다;;
    private final String name;
    private final String tel;
    private final String address;

    public Person(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    void printPersonInfo() {
        System.out.println("name : " + this.name);
        System.out.println("tel : " + this.tel);
        System.out.println("addr : " + this.address);
    }

    public String getName() {
        return name;
    }
}

