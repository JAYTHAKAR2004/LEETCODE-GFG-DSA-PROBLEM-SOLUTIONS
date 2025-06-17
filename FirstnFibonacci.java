import java.util.Arrays;

public class FirstnFibonacci {
    public static int[] fibonacciNumbers(int n) {
        if (n <= 0) return new int[]{};
        if (n == 1) return new int[]{0};
        if (n == 2) return new int[]{0, 1};

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(fibonacciNumbers(n)));
        // Expected Output: [0, 1, 1, 2, 3]
    }
}
