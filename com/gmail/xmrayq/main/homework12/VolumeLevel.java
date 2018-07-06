package com.gmail.xmrayq.main.homework12;

import java.util.Scanner;

public class VolumeLevel {
}

    class MediaBox {
        int volume;

        public MediaBox(int volume) {
            this.volume = volume;
        }

        public void Volume() {

            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter volume ");
            int volume = scanner.nextInt();


            switch (volume)

            {
                case 1:
                    System.out.println(Volume.VOLUME_1.getDescription());
                    break;
                case 2:
                    System.out.println(Volume.VOLUME_2.getDescription());

                    break;
                case 3:
                    System.out.println(Volume.VOLUME_3.getDescription());
                    break;
                default:
                    System.out.println(" Not Volume ");
                    break;

            }

        }

        public void NewVolume() {

            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter volume ");

            int newVolume = scanner.nextInt();

            if (newVolume == 1) {

                System.out.println("New Volume - " + (volume + 1));
            } else if (newVolume == -1) {
                System.out.println("New Volume - " + (volume - 1));
            } else {
                System.out.println(" Volume at the same level");

            }

        }


        enum Volume {

            VOLUME_1("Volume 1"),
            VOLUME_2("Volume 2"),
            VOLUME_3("Volume 3");

            private final String description;

            Volume(String description) {
                this.description = description;

            }

            public String getDescription() {

                return description;
            }
        }


    }