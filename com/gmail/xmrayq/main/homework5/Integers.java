package com.gmail.xmrayq.main.homework5;

public class Integers {

    public void naturalNumbers(int start, int end) {
        int result;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                if (i % 5 != 0) {
                    System.out.println(i);
                }
            }


        }
    }
}