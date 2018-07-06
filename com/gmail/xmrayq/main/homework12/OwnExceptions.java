package com.gmail.xmrayq.main.homework12;


import java.util.Scanner;

public class OwnExceptions extends Exception {


    class OneException extends Exception {
        public OneException(String s) {
            super(s);
        }
    }

    class TwoException extends Exception {
        public TwoException(String s) {
            super(s);
        }
    }

    class ThreeException extends Exception {
        public ThreeException(String message) {
            super(message);
        }
    }


    public void Jokaero() throws OneException, TwoException, ThreeException {

        Scanner scannerConsoleService = new Scanner(System.in);
        System.out.println(" Enter volume ");
        String numberOfException = scannerConsoleService.nextLine();

        if (numberOfException.equals("1")) {
            throw new OneException("One Exception");
        }
        if (numberOfException.equals("2"))
            throw new TwoException("One Exception");
        {
            if (numberOfException.equals("3"))
                throw new ThreeException("One Exception");
        }


    }
}
