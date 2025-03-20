package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BMICalculatorTest {

    @Test
    void testValidCases() {
        assertEquals(22.22, BMICalculator.calculateBMI(1.5, 50), 0.1);
        assertEquals(24.69, BMICalculator.calculateBMI(1.75, 75.7), 0.1);
    }


    @Test
    void testInvalidCases() {
        assertThrows(IllegalArgumentException.class, () -> BMICalculator.calculateBMI(0.4, 50));
        assertThrows(IllegalArgumentException.class, () -> BMICalculator.calculateBMI(1.8, 500));
        assertThrows(IllegalArgumentException.class, () -> BMICalculator.calculateBMI(-1, -50));
    }

    @Test
    void testBoundaryValues() {
        assertEquals(17.30, BMICalculator.calculateBMI(2.5, 108), 0.1); // Allow slight variation
    }

}
