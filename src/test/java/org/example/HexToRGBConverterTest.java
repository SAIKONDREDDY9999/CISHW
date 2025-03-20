package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HexToRGBConverterTest {

    @Test
    void testValidHexCodes() {
        assertArrayEquals(new int[]{255, 87, 51}, HexToRGBConverter.hexToRGB("#FF5733"));
        assertArrayEquals(new int[]{255, 87, 51}, HexToRGBConverter.hexToRGB("FF5733"));
        assertArrayEquals(new int[]{0, 0, 0}, HexToRGBConverter.hexToRGB("#000000"));
        assertArrayEquals(new int[]{255, 255, 255}, HexToRGBConverter.hexToRGB("FFFFFF"));
    }

    @Test
    void testInvalidHexCodes() {
        assertThrows(IllegalArgumentException.class, () -> HexToRGBConverter.hexToRGB("#GG5733")); // Invalid character
        assertThrows(IllegalArgumentException.class, () -> HexToRGBConverter.hexToRGB("FFF")); // Too short
        assertThrows(IllegalArgumentException.class, () -> HexToRGBConverter.hexToRGB("ZZZZZZ")); // Non-hex characters
        assertThrows(IllegalArgumentException.class, () -> HexToRGBConverter.hexToRGB("")); // Empty string
        assertThrows(IllegalArgumentException.class, () -> HexToRGBConverter.hexToRGB(null)); // Null input
    }

    @Test
    void testBoundaryValues() {
        assertArrayEquals(new int[]{0, 0, 0}, HexToRGBConverter.hexToRGB("#000000")); // Min boundary (black)
        assertArrayEquals(new int[]{255, 255, 255}, HexToRGBConverter.hexToRGB("#FFFFFF")); // Max boundary (white)
    }
}
