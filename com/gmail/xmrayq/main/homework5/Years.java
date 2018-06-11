package com.gmail.xmrayq.main.homework5;

public class Years {

    public void calculateNumbers(int year, int end) {
        int summ = 0;
        int sum = 0;
        int result;

        for (int i = year; i <= end; i++) {

            if (((i % 4) == 0) | ((i % 400 == 0))) {
                System.out.println(i + "  " + "366 days in year");
                summ += 366;

            } else {

                System.out.println(i + "  " + "365 days in year");
                sum += 365;
            }
            result = sum + summ;
            System.out.println("sum of days in years = " + result);
        }
    }
}