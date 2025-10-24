package org.example.ch45.ex9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ionut", 10);
        Person p2 = new Person("Ionut2", 15);
        Person p3 = new Person("Ionut3", 20);
        Person p4 = new Person("Ionut", 10);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        for(Person person : persons) {
            System.out.println(person.name() + " is " + person.age() + " years old.");
        }

     //   p1.age() = 25;    eroare

        System.out.println(p1.equals(p4)); //true
        System.out.println(p2.equals(p3)); //false

        System.out.println(p1.hashCode());
        System.out.println(p4.hashCode());
    }

}
