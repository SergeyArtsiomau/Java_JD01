package com.gmail.xmrayq.main.homework11;

import java.util.*;

public class AmountOfUniqueNumbers {
    private static Random random = new Random();

    public static void main(String[] args) {

        int initialCapacity = 50;
        List<Integer> integers = new ArrayList<>(50);
        for (int i = 0; i < initialCapacity; i++) {

            int Num = getRandom(0, 20);
            integers.add(Num);
        }
        System.out.println(integers);


        Map<Integer, Integer> stringMap = new HashMap<>();
      //  stringMap.put(1,i++);

    }



    private static int getRandom(int start, int stop) {
        return random.nextInt(stop - start + 1);


    }

    public static void printKeys(Map<String, String> stringMap) {
        for (Map.Entry<String, String> element : stringMap.entrySet()) {
            String key = element.getKey();
            System.out.println(key);
        }
    }
}
