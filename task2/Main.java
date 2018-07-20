package iit.by.classwork.lesson22_practical_work.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        double sum = 0;
        Thread thread = new ThreadWithFile(5);
        thread.start();

        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<Integer>> integers = new ArrayList<>();

        SingletonService singletonService = SingletonService.getInstance();
        singletonService.readOfStreams(5);
        singletonService.writeOfStreams(5);

        Callable<Integer> callable = new ThreadReadFileService(5);
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = executor.submit(callable);
            integers.add(future);
        }
        for (Future<Integer> future : integers) {
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
