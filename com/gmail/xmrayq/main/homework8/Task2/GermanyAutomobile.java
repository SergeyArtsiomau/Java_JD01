package com.gmail.xmrayq.main.homework8.Task2;

public class GermanyAutomobile extends Automobile {
    @Override
    int getRate() {
        return 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Моя страна -" + Country.GERMANY + "Рейтинг автомобиля" + getRate();
    }
}
