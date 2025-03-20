package org.example;

public class BMICalculator {
    public static double calculateBMI(double height, double weight) {
        if (height < 0.5 || height > 2.5 || weight < 10 || weight > 300) {
            throw new IllegalArgumentException("Error: Height must be between 0.5 and 2.5 meters, Weight must be between 10 and 300 kg");
        }
        return weight / (height * height);
    }
}