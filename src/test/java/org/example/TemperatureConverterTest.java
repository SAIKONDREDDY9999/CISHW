package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    void testValidCases() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40), 0.01);
        assertEquals(37.78, TemperatureConverter.fahrenheitToCelsius(100), 0.01);
    }

    @Test
    void testInvalidCases() {
        assertThrows(IllegalArgumentException.class, () -> TemperatureConverter.fahrenheitToCelsius(-460));
        assertThrows(IllegalArgumentException.class, () -> TemperatureConverter.fahrenheitToCelsius(1001));
    }

    @Test
    void testBoundaryValues() {
        assertEquals(-273.15, TemperatureConverter.fahrenheitToCelsius(-459.67), 0.01); // Min boundary
        assertEquals(537.78, TemperatureConverter.fahrenheitToCelsius(1000.0), 0.01); // Max boundary
        assertThrows(IllegalArgumentException.class, () -> TemperatureConverter.fahrenheitToCelsius(-459.68)); // Min-
        assertThrows(IllegalArgumentException.class, () -> TemperatureConverter.fahrenheitToCelsius(1000.1)); // Max+
    }
}
