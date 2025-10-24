package org.example.ch13.ex1;

import java.util.Scanner;

public class VehicleSpeedMonitor2 {

    public enum Vehicle {car, bus, bike}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter Vehicle type(car, bus, bike): ");
            String vehicle = scanner.nextLine();

            System.out.println("Enter speed: ");
            int speed = scanner.nextInt();
            scanner.nextLine();

            String result = testSpeed(vehicle, speed);
            System.out.println(result);

            if (speed < 0) {
                break;
            }
        }

        scanner.close();
    }

    public static String testSpeed(String vehicle, int speed) {

        int speedLimit;
        boolean flag = true;

        switch (vehicle.toLowerCase()) {
            case "car" -> speedLimit = 100;
            case "bus" -> speedLimit = 80;
            case "bike" -> speedLimit = 60;

            default -> {
                speedLimit = 0;
                flag = false;
                return "Unknown vehicle type";

            }
        }

        if (flag) {
            if (speed > speedLimit) {
                return "Speeding";
            }
            if (speed < 0) {
                return "Exiting system...";
            }
        }
        return "Speed OK";
    }
}
