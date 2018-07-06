package com.gmail.xmrayq.main.homework12;

import java.util.Scanner;

public class мамам {
    public static void main(String[] args) {

   // }
      //  static void ExceptionService() throws OneException1, TwoException1, ThreeException1 {

        Scanner scannerConsoleService = new Scanner(System.in);
        System.out.println(" Enter volume ");
        String numberOfException = scannerConsoleService.nextLine();

        switch (numberOfException)
        {
      //      case 1:
        //        numberOfException.equals("1")) {
          //      throw new OneException1("One Exception");
            //    break;
            //case 2:
              //  TwoException1("dfdfsdf");

             //   break;
            //case 3:
              ///  ThreeException1("cdcd");
                //break;
            //default:
              //  System.out.println("No Exceptions");
                //break;
        }
    }
}

class OneException1 extends Exception {
    public OneException1(String s) {
        super(s);
    }
}

class TwoException1 extends Exception {
    public TwoException1(String s) {
        super(s);
    }
}
class ThreeException1 extends Exception {
    public ThreeException1(String s) {
        super(s);
    }
}


