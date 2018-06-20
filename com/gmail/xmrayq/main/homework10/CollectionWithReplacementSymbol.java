package com.gmail.xmrayq.main.homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionWithReplacementSymbol {

    public static void main(String[] args) {
        System.out.println("Enter new string: ");
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();
        String string4 = scanner.nextLine();
        String string5 = scanner.nextLine();

        List<String> firstList = new ArrayList<>();
        firstList.add(string1);
        firstList.add(string2);
        firstList.add(string3);
        firstList.add(string4);
        firstList.add(string5);

        List<String> secondList = new ArrayList<>();
            for (int i = 0; i < firstList.size(); i++) {
                secondList.add(firstList.get(i).replaceAll("\\+", "+++"));
            }
        System.out.println(firstList);
        System.out.println(secondList);

        }
    }

