package com.gmail.xmrayq.main.homework7;

import java.util.Scanner;

public class NewString {

    public void spaceSuppression() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String ");
        String string = scanner.nextLine();
        System.out.println(string);

        String newString = string.substring(63, 93);
        System.out.println(string.substring(0,63) + newString .replace(" ","") + string.substring(93, 137));


    }
}

