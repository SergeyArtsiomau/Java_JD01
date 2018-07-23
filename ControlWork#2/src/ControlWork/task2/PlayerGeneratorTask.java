package ControlWork.task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class PlayerGeneratorTask implements Callable<File> {
    Random random = new Random();
    File file;

    public PlayerGeneratorTask(File file) {
        this.file = file;
    }

    @Override
    public File call() throws IOException {

        int countOfPlayers = 10;
        List<Player> playerList = new ArrayList<>();
        for (int i = 0; i < countOfPlayers; i++) {
            Player player = new Player("Name " + i, random.nextInt(40 - 20 + 1) + 20, random.nextBoolean());
            playerList.add(player);

        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(" ");

            for (Player player : playerList) {
                bufferedWriter.write(System.lineSeparator());
                bufferedWriter.write(player.toString());
            }
        }
        return file;
    }

}