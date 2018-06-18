package com.gmail.xmrayq.main.homework8.Task1.Task2;

public class Main {

    public static void main(String[] args) {

        RussianAutomobile russianAutomobile = new RussianAutomobile();
        russianAutomobile.getRate();
        System.out.println(russianAutomobile.getDescription());
        GermanyAutomobile germanyAutomobile = new GermanyAutomobile();
        germanyAutomobile.getRate();
        System.out.println(germanyAutomobile.getDescription());
        EnglandAutomobile englandAutomobile = new EnglandAutomobile();
        englandAutomobile.getRate();
        System.out.println(englandAutomobile.getDescription());

    }
}
