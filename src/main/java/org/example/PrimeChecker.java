package org.example;

public class PrimeChecker {
    public static boolean isPrime(int num) {
        if (num < 2 || num > 10000) {
            throw new IllegalArgumentException("Error: Input number must be an integer within the range [2, 10,000]");
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
