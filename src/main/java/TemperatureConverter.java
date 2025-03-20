package org.example;

public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        if (fahrenheit < -459.67 || fahrenheit > 1000.0) {
            throw new IllegalArgumentException("Error: Input temperature must be a number within the range [-459.67, 1000.0]");
        }
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
