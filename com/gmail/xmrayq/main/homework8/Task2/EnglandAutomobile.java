package com.gmail.xmrayq.main.homework8.Task1.Task2;

public class EnglandAutomobile extends Automobile{

    @Override
    int getRate() {
        return 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " Моя страна -" + Country.ENGLAND + "Рейтинг автомобиля" + getRate();
    }
}
