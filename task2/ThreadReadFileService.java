package iit.by.classwork.lesson22_practical_work.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class ThreadReadFileService implements Callable<Integer> {

    int count;

    public ThreadReadFileService(int i) {
        count = i;
    }

    @Override
    public Integer call() {
        Integer maxElement;
        List<Integer> integers = new ArrayList<>();
        try (BufferedReader bufferReader = new BufferedReader(new FileReader("collections" + count + ".txt"))) {
            String line;
            while ((line = bufferReader.readLine()) != null) {
                integers.add(Integer.valueOf(line));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        maxElement = Collections.max(integers);
        return maxElement;
    }

}
