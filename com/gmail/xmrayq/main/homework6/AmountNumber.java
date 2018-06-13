package com.gmail.xmrayq.main.homework6;

import java.util.Scanner;

public class AmountNumber {

    public static void amountOfNumberService() {
        int sum = 0;
        int element;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter new number ");

        int n = scanner.nextInt();
        System.out.println(n);

        while (n != 0) {
            element = n % 10;

            n  /= 10;

            sum += element;
            i++;
        }

        System.out.println("-----------");
        System.out.println("Amount = " + i + "  " + "Summa = " + sum);
    }
}


