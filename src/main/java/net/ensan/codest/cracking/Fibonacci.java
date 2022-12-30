package net.ensan.codest.cracking;

public class Fibonacci {

    /**
     * Time performance: O(2^N)
     */
    public long fibonacci(int i) {
        if (i == 0) return 0L;
        if (i == 1) return 1L;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    /**
     * Time performance: O(N)
     */
    public long fibonacciTopDown(int i) {
        return fibonacciTopDown(i, new long[i + 1]);
    }

    private long fibonacciTopDown(int i, long[] memo) {
        if (i == 0 || i == 1) return i;
        if (memo[i] == 0) {
            memo[i] = fibonacciTopDown(i - 1, memo) + fibonacciTopDown(i - 2, memo);
        }
        return memo[i];
    }

    /**
     * Time performance: O(N)
     */
    public long fibonacciBottomUp(int i) {
        if (i == 0 || i == 1) return i;

        long[] memo = new long[i];
        memo[0] = 0;
        memo[1] = 1;
        for (int index = 2; index < i; index++) {
            memo[index] = memo[index - 1] + memo[index - 2];
        }
        return memo[i - 1] + memo[i - 2];
    }

    public static void main(String[] args) {
        int number = 50;
        long startTime = System.currentTimeMillis();
        long result = new Fibonacci().fibonacciBottomUp(number);
        long endTime = System.currentTimeMillis();
        System.out.printf("Fibonacci for %dth is: %d and the calculation took %d seconds", number, result, (endTime - startTime) / 1000);
    }
}
