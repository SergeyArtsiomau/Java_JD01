package com.gmail.xmrayq.main.homework10;

import java.util.*;

public class MaxNumber {
    private static Random random = new Random();


    public static void main(String[] args) {
        int max1 = 0;
        int max2 = 0;
        int countOfNumbers = 20;
        List<Integer> numbers = new ArrayList<Integer>(20);
        for (int i = 0; i < countOfNumbers; i++) {

            Integer number = new Integer(getNumber(2, 98));
            numbers.add(number);
        }

        Collections.max(numbers);

        for (Integer i : numbers) {
            if (i > max1)
                max1 = i;
            if (max2 < i && i < max1)
                max2 = i;
        }
        System.out.println(numbers);
        System.out.println(Collections.max(numbers));
        System.out.println(max2);


    }


    private static int getNumber(int start, int end) {

        return random.nextInt(end - start + 1) + start;

    }

}
