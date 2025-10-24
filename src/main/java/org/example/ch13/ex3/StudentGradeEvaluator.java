package org.example.ch13.ex3;

import java.util.Scanner;

public class StudentGradeEvaluator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student name (or 'exit' to stop):");
            String name = scanner.next();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Program terminated.");
                break;
            }

            System.out.println("Enter 3 test scores:");
            int grade1 = scanner.nextInt();
            int grade2 = scanner.nextInt();
            int grade3 = scanner.nextInt();

            System.out.println("Enter attendance percentage:");
            int attendance = scanner.nextInt();
            scanner.nextLine();

            double averageScore = calculateAverageScore(grade1, grade2, grade3);
            String averageScoreFormatted = String.format("%.2f", averageScore);
            System.out.println("Average: " + averageScoreFormatted
                    + " Grade: " + calculateGrade(averageScore)
                    + " -> " + calculatePassing(attendance, averageScore));

        }
    }

    public static double calculateAverageScore(int grade1, int grade2, int grade3) {
        return (double) (grade1 + grade2 + grade3) / 3;
    }

    public static char calculateGrade(double averageScore) {

        char grade = switch ((int) Math.round(averageScore / 10)) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };

        return grade;
    }

    public static String calculatePassing(int attendance, double averageScore) {
        if (attendance >= 75 && averageScore >= 70) {
            return "Pass";
        } else if (attendance < 70 && averageScore >= 50) {
            return "Re-exam";
        } else {
            return "Fail";
        }
    }
}
