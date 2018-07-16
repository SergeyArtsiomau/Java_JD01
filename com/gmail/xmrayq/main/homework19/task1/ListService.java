package com.gmail.xmrayq.main.homework19.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public interface ListService {
    Random random = new Random();

    void writeCollection();

}

class ArrayListService implements ListService {


    public void writeCollection() {
        int countOfNumbers = 50;
        List<Integer> integerList = new ArrayList<>(50);
        for (int i = 0; i < countOfNumbers; i++) {
            integerList.add(random.nextInt(20));
        }
        System.out.println(integerList);
    }
}

class LinkedListService implements ListService {

    public void writeCollection() {
        int countOfNumbers = 50;
        List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < countOfNumbers; i++) {
            integerList.add(random.nextInt(20));
        }
        System.out.println(integerList);
    }
}
