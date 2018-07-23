package ControlWork.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Stream extends Thread {
    private static Random random = new Random();

    int count;

    public Stream(int i) {
        count = i;
    }

    @Override
    public void run() {

        String[] wordList = new String[4];

        String words = new String("In any programming language arrays are used that are convenient for working with a large number of the same type of data");
        String[] word = words.split(" ");

        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = word[random.nextInt(word.length)];
            System.out.println(wordList[i]);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("notes" + count + ".txt"))) {
            bufferedWriter.write(getName() + " ");

            for (int i = 0; i < wordList.length; i++) {
                String string = String.valueOf(wordList[i] + " ");
                bufferedWriter.write(string);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





