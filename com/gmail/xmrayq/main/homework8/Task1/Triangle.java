package com.gmail.xmrayq.main.homework8.Task1;

public class Triangle extends Figure {

    private double height;
    private double party1;
    private double party2;
    private double party3;

    public Triangle(double height, double party1, double party2, double party3) {
        this.height = height;
        this.party1 = party1;
        this.party2 = party2;
        this.party3 = party3;

    }

    @Override
    public double getPerimeter() {
        double perimetr = party1 + party2 + party3;
        return perimetr;
    }

    @Override
    public double getSquare() {
        double square = 0.5 * height * party3;
        return square;
    }
}
