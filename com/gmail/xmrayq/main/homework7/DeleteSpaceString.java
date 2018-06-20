package com.gmail.xmrayq.main.homework7;

import java.util.Scanner;

public class DeleteSpaceString {
    public void spaceSuppression() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String ");
        String string = scanner.nextLine();

        int count = 0;
        int sign1 = 0;
        int sign2 = string.length();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '?') {
                count++;
                if (count == 2) sign1 = i;
                if (count == 3) sign2 = i;
            }
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(string.substring(0, sign1));
        stringbuilder.append(string.substring(sign1, sign2).replaceAll(" ", ""));
        stringbuilder.append(string.substring(sign2));

        System.out.println(stringbuilder.toString());
    }

}

