package jungOl.j196_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 객체 리스트 선언
        ArrayList<Person> personList = new ArrayList<>();



        // 인풋 케이스 숫자에 관계없이 입력을 받을 수 있는 반복문 알고리즘
        while (true){

            // 다음 라인을 읽으려고 시도
            String inputStringLine = br.readLine();
            // 만약 다음 라인이 비어있다면 while() 탈출
            if(inputStringLine == null || inputStringLine.isEmpty()){
                break;
            }

            //
            // 읽은 라인을 띄어쓰기 기준으로 파싱
            String[] parseString = inputStringLine.split(" ");

            // 객체 생성하여 리스트에 추가
            Person p1 = new Person(parseString[0], parseString[1], parseString[2]);
            personList.add(p1);
        }
        br.close();

        //
        // personList 를 이름순 정렬 (익명 함수 사용)
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

