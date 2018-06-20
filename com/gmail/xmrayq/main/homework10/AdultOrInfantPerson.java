package com.gmail.xmrayq.main.homework10;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdultOrInfantPerson {
    private static Random random = new Random();

    public static void main(String[] args) {
        int countOfPersons = 20;
        List<Person> personsList = new ArrayList<>(20);
        for (int i = 0; i < countOfPersons; i++) {
            Person person = new Person(getNumber(15, 30));
            if (person.getAge() >= 18) {
                System.out.println("Adult:  " + person);

            } else {
                System.out.println("Infant: " + person);
            }
            personsList.add(person);

        }
    }

    private static int getNumber(int start, int end) {

        return random.nextInt(end - start + 1) + start;

    }
}

