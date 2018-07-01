package KontrolWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ActivePlayer {
    private static Random random = new Random();

    public static void main(java.lang.String[] args) {

        int countOfPlayer = 20;
        List<Player> playerList = new ArrayList<>(20);
        for (int i = 0; i < countOfPlayer; i++) {
            Player player = new Player(getAge(20,40), random.nextBoolean());

            if (player.getAge() >= 25 && player.getAge() <= 30 && player.isActive() == true) {
                System.out.println(player);
            }
            playerList.add(player);
        }
    }

    public static int getAge(int start, int stop) {

        return random.nextInt(stop - start + 1) + start;
    }

}
