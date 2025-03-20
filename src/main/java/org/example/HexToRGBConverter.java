package org.example;

public class HexToRGBConverter {
    public static int[] hexToRGB(String hexColor) {
        if (hexColor == null || (!hexColor.matches("^#?[A-Fa-f0-9]{6}$"))) {
            throw new IllegalArgumentException("Error: Input must be a valid HEX color code (#RRGGBB or RRGGBB)");
        }

        // Remove # if present
        if (hexColor.startsWith("#")) {
            hexColor = hexColor.substring(1);
        }

        int r = Integer.parseInt(hexColor.substring(0, 2), 16);
        int g = Integer.parseInt(hexColor.substring(2, 4), 16);
        int b = Integer.parseInt(hexColor.substring(4, 6), 16);

        return new int[]{r, g, b};
    }
}
