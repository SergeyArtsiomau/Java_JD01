package com.gmail.xmrayq.main.homework17.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        double sum = 0;
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Future<Integer>> list = new ArrayList<>();
        Callable<Integer> callable = new ThreadCallableNumberService();

        for (int i = 0; i < 10; i++) {
            Future<Integer> future = executor.submit(callable);
            list.add(future);
        }
        for (Future<Integer> future : list) {
            try {
                Integer integer = future.get();
                sum += integer;
                System.out.println("MaxElementThread - " + integer);
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Arithmetic Average - " + sum / 10);

    }
}