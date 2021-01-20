package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person("b", 1));
        list.add(new Person("a", 3));
        list.add(new Person("c", 4));
        list.add(new Person("g", 2));
        list.add(new Person("f", 5));
        list.add(new Person("e", 6));

        for (Person p:
             list) {
            System.out.println(p.getId() + p.getTen());
        }
        System.out.println("---");

        Collections.sort(list);
        for (Person p:
                list) {
            System.out.println(p.getId() + p.getTen());
        }
        System.out.println("---");
    }
}
// Sap xep theo (String) hoac (int);

// Dao dau de nguoc lai -();