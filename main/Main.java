package com.gmail.xmrayq.main;

public class Main {
    public static void main(String[] args) {
        Years days = new Years();
        SquareOfNumbers numbers = new SquareOfNumbers();
        Integers integers = new Integers();
        days.calculateNumbers(2000, 2010);
        System.out.println("___________________________");
        numbers.squareNumbers(10, 20);
        System.out.println("___________________________");
        integers.naturalNumbers(20, 50);
    }
}
