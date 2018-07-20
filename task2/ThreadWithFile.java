package iit.by.classwork.lesson22_practical_work.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadWithFile extends Thread{
    int count;
    Random random = new Random();

    public ThreadWithFile(int i) {
        count = i;
    }

    @Override
    public void run() {

        int countOfNumbers = 10;
        int maxElement = 0;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < countOfNumbers; i++) {
            integerList.add(random.nextInt(100));
            if (integerList.get(i) > maxElement) {
                maxElement = integerList.get(i);
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("collections" + count + ".txt"))) {
            for (int i = 0; i < countOfNumbers; i++) {
                String string = String.valueOf(integerList.get(i) + " ");
                bufferedWriter.write(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

