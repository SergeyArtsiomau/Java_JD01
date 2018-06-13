package com.gmail.xmrayq.main.homework4;

public class HomeworkLesson4 {

    public static void main(String[] args) {
        years();
        times();

        int[] massive1 = new int[4];
        int[] massive2 = new int[4];

        massive1[0] = 3;
        massive1[1] = 4;
        massive1[2] = 2;
        massive1[3] = 6;

        massive2[0] = 5;
        massive2[1] = 9;
        massive2[2] = 7;
        massive2[3] = 3;

        int[] massive3 = new int[8];

        massive3[0] = massive1[0];
        massive3[1] = massive1[1];
        massive3[2] = massive1[2];
        massive3[3] = massive1[3];
        massive3[4] = massive2[0];
        massive3[5] = massive2[1];
        massive3[6] = massive2[2];
        massive3[7] = massive2[3];

        System.out.print(massive3[0]);
        System.out.print(" ");
        System.out.print(massive3[1]);
        System.out.print(" ");
        System.out.print(massive3[2]);
        System.out.print(" ");
        System.out.print(massive3[3]);
        System.out.print(" ");
        System.out.print(massive3[4]);
        System.out.print(" ");
        System.out.print(massive3[5]);
        System.out.print(" ");
        System.out.print(massive3[6]);
        System.out.print(" ");
        System.out.println(massive3[7]);
    }

    public static int years() {
        int year = 2024;
        int days;

        if (((year % 4) == 0) || ((year % 400 == 0) && (year % 100 != 0))) {
            days = 366;
        } else {
            days = 365;
        }
        return days;
    }

    public static void times() {
        int time = 3;

        switch (time) {
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("There is no such time in the year");
        }
    }

}


