package com.mrensan.codest.bas;

import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Tests {@code WhileLoop} class.
 */
public class WhileLoopTest {

    @Test
    public void countIntegerDigitsTest() {
        WhileLoop whileLoop = new WhileLoop();
        int result1 = whileLoop.countIntegerDigits(456);
        int result2 = whileLoop.countIntegerDigits(4);
        int result3 = whileLoop.countIntegerDigits(10);
        int result4 = whileLoop.countIntegerDigits(657463);

        assertEquals("The digits count in 456", 3, result1);
        assertEquals("The digits count in 4", 1, result2);
        assertEquals("The digits count in 10", 2, result3);
        assertEquals("The digits count in 657463", 6, result4);
    }

    @Test
    public void printFibonacciTest() {
        WhileLoop whileLoop = new WhileLoop();
        whileLoop.printFibonacci(0);
        System.out.println();

        whileLoop.printFibonacci(1);
        System.out.println();

        whileLoop.printFibonacci(3);
        System.out.println();

        whileLoop.printFibonacci(43);
        System.out.println();

        assertTrue("look at printed output for check correct function", true);
    }
}
