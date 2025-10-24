package org.example.ch45.ex6;

public class Triangle extends Shape{

    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double area() {
        return (base * height) / 2;
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC;
    }


}
