package com.gmail.xmrayq.main.homework7;

import java.util.Scanner;

public class LinesWithWordCatOrDogService {

    public void checkOfLines() {

        int notCorrespondingLines = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();
        String str = scanner.nextLine();
        System.out.println("Enter " + arrayLength + " string: ");
        String[] string = new String[arrayLength];
        for (int i = 0; i < string.length; i++) {
            string[i] = scanner.nextLine();
        }

        for (int i = 0; i < string.length; i++) {
            if (string[i].contains("cat") || (string[i].contains("dog"))) {
                String lines = string[i];
                System.out.println("Lines in which the word cat or dog meets - " + lines + " Total length: " + string[i].length());
            } else {

                notCorrespondingLines++;
            }
        }
        System.out.println("-----------------");
        System.out.println("Don't correspond - " + notCorrespondingLines + " lines");
    }
}