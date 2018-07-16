package com.gmail.xmrayq.main.homework19.task2;

import java.util.*;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {

        List<Person> person = new ArrayList<Person>();

        for (int i = 0; i < 10; i++) {

            person.add(new Person.PersonBuilder1()
                    .withName("Name" + i).
                            withSurname("Surname" + i).
                            withYear(random.nextInt(1990 - 1950 + 1) + 1950).build());

        }
        Collections.sort(person, new PersonYearComparator());

        for (Person persons : person) {

            System.out.println(persons.toString());


        }
    }
}
