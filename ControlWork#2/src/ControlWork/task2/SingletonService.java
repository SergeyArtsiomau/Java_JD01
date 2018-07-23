package ControlWork.task2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SingletonService {

    private static SingletonService instance = null;

    private SingletonService() {
    }

    public static SingletonService getInstance() {
        if (instance == null) {
            instance = new SingletonService();
        }
        return instance;
    }

    public void players() {
        List<String> list = collectionNameFile();
        returnNamePlayer(list);
    }

    private List<String> collectionNameFile() {
        List<String> listFileNames = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listFileNames.add("notes" + i + ".txt");
        }
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<File>> futures = new ArrayList<>();
        for (String element : listFileNames) {
            Callable<File> callable = new PlayerGeneratorTask(new File(element));
            Future<File> fileFuture = executorService.submit(callable);
            futures.add(fileFuture);
        }
        for (Future<File> future : futures) {
            try {
                System.out.println(future.get());

            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());
            }
        }
        executorService.shutdown();
        return listFileNames;
    }

    private void returnNamePlayer(List<String> filesList) {
        List<Player> playerList;
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Callable<List<Player>> callable;
        List<Future<List<Player>>> futureList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            callable = new PlayerReaderTask(new File(filesList.get(i)));
            Future<List<Player>> future = executorService.submit(callable);
            futureList.add(future);
        }
        for (Future<List<Player>> future : futureList) {
            try {
                playerList = future.get();
                for (Player player : playerList) {
                    System.out.println(player.getName());
                }
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());
            }
        }
        executorService.shutdown();
    }
}