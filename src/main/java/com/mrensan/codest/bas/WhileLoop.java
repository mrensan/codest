package com.mrensan.codest.bas;

/**
 * Shows while loop applications in programming.
 *
 * @author shahram at gmail.com
 */
public class WhileLoop {

    /**
     * Counts the number of digits in an integer.
     */
    public int countIntegerDigits(int n) {
        int result = 0;
        while (n > 0) {
            n = n / 10;
            result++;
        }
        return result;
    }

    /**
     * Prints Fibonacci numbers until not exceeding n.
     */
    public void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        int c;
        while (a <= n) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
