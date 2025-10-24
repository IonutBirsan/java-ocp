package org.example.ch13.ex1;

import java.util.Scanner;

public class VehicleSpeedMonitor {

    public enum Vehicle {car, bus, bike}

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Enter Vehicle type(car, bus, bike): ");
            String vehicle = scanner.nextLine();

            System.out.println("Enter speed: ");
            int speed = scanner.nextInt();
            scanner.nextLine();

            if (speed < 0) {
                System.out.println("Exiting system...");
                break;
            }

            int speedLimit;

            switch (vehicle.toLowerCase()) {
                case "car" -> speedLimit = 100;
                case "bus" -> speedLimit = 80;
                case "bike" -> speedLimit = 60;

                default -> {
                    System.out.println("Unknown vehicle type");
                    speedLimit = 0;
                }
            }

            if (speed > speedLimit) {
                System.out.println("Speeding");
            }

            if (speed < speedLimit) {
                System.out.println("Speed OK");
            }

        }

        scanner.close();

    }
}
