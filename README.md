# Assignment: Java Functions with JUnit Testing

## Overview
This project contains five Java functions, each tested with JUnit for correctness and 100% statement coverage.

## Implemented Functions

1. **Fibonacci Number Calculator**
    - Function Name: `calculateNthFibonacci(int n)`
    - Valid Input: Integer `n` between `0` and `50`
    - Expected Output: Fibonacci number (long)
    - Invalid Input Handling: Throws an error if `n < 0` or `n > 50`

2. **Body Mass Index (BMI) Calculator**
    - Function Name: `calculateBMI(double height, double weight)`
    - Valid Input: Height (meters) between `0.5` and `2.5`, Weight (kg) between `10` and `300`
    - Expected Output: BMI value (double)
    - Invalid Input Handling: Throws an error if height/weight is out of range

3. **Prime Number Checker**
    - Function Name: `isPrime(int num)`
    - Valid Input: Integer `num` between `2` and `10,000`
    - Expected Output: Boolean (`true` if prime, `false` otherwise)
    - Invalid Input Handling: Throws an error if `num < 2`

4. **Fahrenheit to Celsius Converter**
    - Function Name: `fahrenheitToCelsius(double fahrenheit)`
    - Valid Input: Fahrenheit value between `-459.67` and `1000.0`
    - Expected Output: Celsius value (double)
    - Invalid Input Handling: Throws an error if `fahrenheit < -459.67`

5. **HEX to RGB Converter**
    - Function Name: `hexToRGB(String hexColor)`
    - Valid Input: HEX color string in format `#RRGGBB` or `RRGGBB`
    - Expected Output: Integer array `{R, G, B}` (each value between `0` and `255`)
    - Invalid Input Handling: Throws an error for invalid HEX formats
