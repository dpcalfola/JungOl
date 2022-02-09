package jungOl.j195;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Person p = new Person(st.nextToken(), st.nextToken(), st.nextToken());

        String result = String.format("name : %s\ntel : %s\naddr : %s\n",
                p.getName(), p.getTel(), p.getAddress());

        System.out.println(result);
    }

}

class Person {
    private final String name;
    private final String tel;
    private final String address;

    public Person(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }
}
