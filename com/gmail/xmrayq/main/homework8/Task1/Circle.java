package com.gmail.xmrayq.main.homework8.Task1;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perimetr = Math.PI * 2 * radius;
        return perimetr;

    }

    @Override
    public double getSquare() {
        double square = Math.PI * radius * radius;
        return square;
    }
}