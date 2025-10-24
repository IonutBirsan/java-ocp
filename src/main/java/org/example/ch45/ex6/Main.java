package org.example.ch45.ex6;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5, 4, 3);

        List<Shape> shapes = List.of(circle, rectangle, triangle);

        shapes.forEach(shape -> {
            System.out.println(shape.getClass());
            System.out.println(shape.area());
            System.out.println(shape.perimeter());
        });

    }
}
