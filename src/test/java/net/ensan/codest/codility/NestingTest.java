package net.ensan.codest.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class NestingTest {
    @Test
    public void calculateNesting() throws Exception {
        Nesting nesting = new Nesting();
        assertEquals(1, nesting.calculateNesting(""));
        assertEquals(0, nesting.calculateNesting(")"));
        assertEquals(0, nesting.calculateNesting("("));
        assertEquals(1, nesting.calculateNesting("()"));
        assertEquals(1, nesting.calculateNesting("(()(())())"));
        assertEquals(0, nesting.calculateNesting("(()(())))())"));
    }

}