package com.gmail.xmrayq.main.homework17.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class ThreadCallableNumberService implements Callable<Integer> {

    private Random random = new Random();

    @Override
    public Integer call() throws Exception {
        int maxElement = 0;
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            if (integers.get(i) > maxElement) {
                maxElement = integers.get(i);
            }
        }
        Thread.sleep(1500);

        return maxElement;

    }
}
