package com.gmail.xmrayq.main.homework16;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread thread = new MaxElementService();
            thread.setName(" Thread Name " + i);
            thread.start();
        }

        for (int i = 0; i < 5; i++) {
            Thread thread = new FileCreatedService();
            thread.setName(" Thread Name-One " + i);
            thread.start();
        }
        SynhronizeService synhronizeService = new SynhronizeService();
        for (int i = 0; i < 10; i++) {
            Thread thread = new ThreadSynhronizedService(synhronizeService);
            thread.setName(" Thread Name-Two " + i);
            thread.start();
        }
    }
}