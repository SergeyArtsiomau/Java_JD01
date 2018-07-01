package KontrolWork;

import java.util.Scanner;

public class RemoveSymbolsBetweenBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter text ");
        String someString = scanner.nextLine();

        int bracketOne = someString.indexOf("(");
        int bracketTwo = someString.indexOf(")");

        if (bracketOne == -1 || bracketTwo == -1) {
            System.out.println(" Not ')' or '(' ");
        } else {
            String newString = someString.replaceAll("\\(.*\\)", "\\(\\)");
            System.out.println("New String " + newString);
        }
    }
}