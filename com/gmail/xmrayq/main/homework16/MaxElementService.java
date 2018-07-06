package com.gmail.xmrayq.main.homework16;

import java.util.Random;

public class MaxElementService extends Thread {

    private static Random random = new Random();

    @Override
    public void run() {
        int maxElement = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        System.out.println( getName() + " Result - " + maxElement);
    }
}