package com.gmail.xmrayq.main.homework6;

import java.util.Random;
import java.util.Scanner;

public class ArrayOfRandomNumber {

    public void randomNumberService() {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter new number beginning line ");

        int m = scanner.nextInt();
        System.out.println(m);
        System.out.println(" Enter new number ending line ");

        int p = scanner.nextInt();
        System.out.println(p);
        System.out.println("Enter array length:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Array of random numbers");

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(p);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                sum++;

            }

        }
        System.out.println("  ");
        System.out.println("-------------");
        System.out.println("Even numbers = " + sum);

    }
}
