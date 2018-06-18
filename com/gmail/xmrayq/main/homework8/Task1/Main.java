package com.gmail.xmrayq.main.homework8.Task1;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        Figure figure = new Figure();
        figure.getPerimeter();
        figure.getSquare();
        Circle circle = new Circle(3);
        circle.getPerimeter();
        circle.getSquare();
        Triangle triangle = new Triangle(5, 6, 7, 4);
        triangle.getPerimeter();
        triangle.getSquare();
        Rectangle rectangle = new Rectangle(6, 8);
        rectangle.getPerimeter();
        rectangle.getSquare();

        Figure[] figures = {new Triangle(4, 6, 8, 10),
                new Circle(10), new Circle(8), new Rectangle(4, 8),
                new Rectangle(3, 7)};
        for (Figure element : figures) {
            sum = sum + element.getPerimeter();
        }
        System.out.println(sum);
    }
}