package net.ensan.codest.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsTest {
    @Test
    public void calculateBrackets() throws Exception {
        Brackets brackets = new Brackets();
        assertEquals(1, brackets.calculateBrackets(""));
        assertEquals(1, brackets.calculateBrackets("()"));
        assertEquals(0, brackets.calculateBrackets("())"));
        assertEquals(0, brackets.calculateBrackets("{()]"));
        assertEquals(1, brackets.calculateBrackets("{[()()]}"));
        assertEquals(0, brackets.calculateBrackets("([)()]"));
    }

}