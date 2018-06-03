package com.gmail.xmrayq.main;

public class Main {
    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard(347575899, 340);
        creditCard1.printInfo();
        creditCard1.addMoney(110);

        CreditCard creditCard2 = new CreditCard(578699905, 270);
        creditCard2.printInfo();
        creditCard2.addMoney(230);

        CreditCard creditCard3 = new CreditCard(789030482, 560);
        creditCard3.printInfo();
        creditCard3.differenceMoney(120);

    }
}
