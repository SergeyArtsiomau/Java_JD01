package ControlWork.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SingletonService singletonService = SingletonService.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter amount of thread");
        int n = scanner.nextInt();
        singletonService.startOfStream(n);
    }
}
