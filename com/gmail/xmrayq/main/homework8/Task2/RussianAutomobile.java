package com.gmail.xmrayq.main.homework8.Task1.Task2;

public class RussianAutomobile extends Automobile {

    @Override
    int getRate() {
        return 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна -" + Country.RUSSIA + "Рейтинг автомобиля" + getRate();

    }

}