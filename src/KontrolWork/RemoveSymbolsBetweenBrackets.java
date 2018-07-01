package KontrolWork;

import java.util.Scanner;

public class RemoveSymbolsBetweenBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter text ");
        String someString = scanner.nextLine();

        private int bracketOne = someString.indexOf("(");
        private int bracketTwo = someString.indexOf(")");

        if (bracketOne == -1 || bracketTwo == -1) {
            System.out.println(" Not ')' or '(' ");
        } else {
            String newString = someString.replaceAll("\\(.*\\)", "\\(\\)");
            //".*" - последовательность для обозначения любого количества любых символов между двумя частями регулярного выражения
            System.out.println("New String " + newString);
        }
    }
}
