package ControlWork.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class PlayerReaderTask implements Callable<List<Player>> {

    private File file;

    public PlayerReaderTask(File file) {

        this.file = file;
    }

    @Override
    public List<Player> call() {

        List<Player> players = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(" ");
                Player player = new Player(split[0], Integer.valueOf(split[1]), Boolean.valueOf(split[2]));
                if (player.getAge() >= 25 && player.getAge() <= 30) {
                    players.add(player);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return players;
    }
}