package com.gmail.xmrayq.main.homework6;

import java.util.Random;
import java.util.Scanner;


public class GenerateNumber {

    public void generateNumberService() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");

        int n = scanner.nextInt();

        System.out.println(n);
        Random random = new Random();

        int randomNumber = random.nextInt(n + n + 1) - n;

        System.out.print("Random Number - " + randomNumber);


    }
}

