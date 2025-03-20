package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTest {

    @Test
    void testValidPrimeNumbers() {
        assertTrue(PrimeChecker.isPrime(2));
        assertTrue(PrimeChecker.isPrime(3));
        assertTrue(PrimeChecker.isPrime(29));
        assertTrue(PrimeChecker.isPrime(9973)); // Large prime within range
    }

    @Test
    void testValidNonPrimeNumbers() {
        assertFalse(PrimeChecker.isPrime(4));
        assertFalse(PrimeChecker.isPrime(15));
        assertFalse(PrimeChecker.isPrime(100));
        assertFalse(PrimeChecker.isPrime(9998));
    }

    @Test
    void testInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> PrimeChecker.isPrime(1)); // Less than 2
        assertThrows(IllegalArgumentException.class, () -> PrimeChecker.isPrime(-5)); // Negative number
        assertThrows(IllegalArgumentException.class, () -> PrimeChecker.isPrime(10001)); // More than 10,000
    }

    @Test
    void testBoundaryValues() {
        assertTrue(PrimeChecker.isPrime(2)); // Min boundary
        assertFalse(PrimeChecker.isPrime(10_000)); // Max boundary (not prime)
    }
}
