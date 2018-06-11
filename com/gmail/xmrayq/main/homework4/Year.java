package com.gmail.xmrayq.main.homework4;

public class Year {

    public static void main(String[] args) {

        int year = 2020;

        if (((year % 4) == 0) || ((year % 400 == 0) && (year % 100 != 0)))
            System.out.println("Number days in a year = 366");
        else
            System.out.println("Number days in a year = 365");
    }
}
