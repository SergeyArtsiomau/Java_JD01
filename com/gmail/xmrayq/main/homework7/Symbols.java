package com.gmail.xmrayq.main.homework7;

import java.util.Scanner;

public class Symbols {

    public void  matchSymbols () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String ");
        String string = scanner.nextLine();

        char[] array = string.toCharArray();
        System.out.println(string);
        System.out.println();
        System.out.println("The symbols match the last symbol line");

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[array.length - 1]) {
                System.out.print(i + "  ");


            }
        }
    }
}
