public class Fibonacci {
    public static long calculateNthFibonacci(int n) {
        if (n < 0 || n > 50) {
            throw new IllegalArgumentException("Error: Input must be a non-negative integer within [0,50]");
        }
        if (n <= 1) return n;

        long prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
