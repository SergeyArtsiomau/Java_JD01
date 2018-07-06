package com.gmail.xmrayq.main.homework16;

import java.io.*;
import java.util.Random;

public class FileCreatedService extends Thread {

    private static Random random = new Random();

    @Override
    public void run() {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("notes.txt", true))) {
            bufferedWriter.write(getName() + " ");

            for (int i = 0; i < array.length; i++) {
                String string = String.valueOf(array[i] + " ");
                bufferedWriter.write(string);

            }
            bufferedWriter.append("\n");

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}