import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    void testValidInputs() {
        assertEquals(0, Fibonacci.calculateNthFibonacci(0));
        assertEquals(1, Fibonacci.calculateNthFibonacci(1));
        assertEquals(21, Fibonacci.calculateNthFibonacci(8));
    }

    @Test
    void testInvalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateNthFibonacci(-1));
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateNthFibonacci(51));
    }

    @Test
    void testBoundaryValues() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateNthFibonacci(-1));  // min-
        assertEquals(0, Fibonacci.calculateNthFibonacci(0));     // min
        assertEquals(1, Fibonacci.calculateNthFibonacci(1));     // min+
        assertEquals(12586269025L, Fibonacci.calculateNthFibonacci(50)); // max
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.calculateNthFibonacci(51));  // max+
    }
}
