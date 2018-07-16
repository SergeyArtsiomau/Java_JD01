package com.gmail.xmrayq.main.homework19.task2;

import java.util.Comparator;

public class PersonYearComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getYear() > o2.getYear())
            return 1;
        else if (o1.getYear() < o2.getYear())
            return -1;
        else
            return 0;
    }
}

