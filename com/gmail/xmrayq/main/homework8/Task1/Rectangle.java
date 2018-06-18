package com.gmail.xmrayq.main.homework8.Task1;

public class Rectangle extends Figure {

    private double height;
    private double length;

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        double perimetr = 2 * (height + length);
        return perimetr;
    }

    @Override
    public double getSquare() {
        double square = height * length;
        return square;
    }
}
