package org.example.ch45.ex1;

public class TemperatureConverter {

    public static int toCelsius(double fahrenheit) {
        return (int) Math.round((fahrenheit - 32) * 5 / 9);
    }

    public static int toFahrenheit(double celsius) {
        return (int) Math.round((celsius * 9 / 5) + 32);
    }

}
