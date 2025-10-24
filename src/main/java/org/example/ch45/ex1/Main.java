package org.example.ch45.ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature: ");
        double temperature = scanner.nextDouble();

        System.out.println("Unit (C/F): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        int result;

        if (Character.toLowerCase(unit) == 'c') {
            result = (int) TemperatureConverter.toFahrenheit(temperature);
        } else if (Character.toLowerCase(unit) == 'f') {
            result = (int) TemperatureConverter.toCelsius(temperature);
        } else {
            System.out.println("Unknown unit");
            return;
        }
        System.out.println("Converted temperature: " + result);

    }


}
