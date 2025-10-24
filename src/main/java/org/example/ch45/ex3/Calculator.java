package org.example.ch45.ex3;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(int a, double b) {
        return b + a;
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.5, 2.7));
        System.out.println(calculator.add(2, 10.2));
    }

}
