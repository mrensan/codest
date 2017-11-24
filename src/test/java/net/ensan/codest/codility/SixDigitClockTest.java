package net.ensan.codest.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class SixDigitClockTest {
    @Test
    public void calculateSixDigitClock() throws Exception {
        SixDigitClock sixDigitClock = new SixDigitClock();
        assertEquals("00:00:00", sixDigitClock.calculateSixDigitClock(0, 0, 0, 0, 0, 0));
        assertEquals("07:08:09", sixDigitClock.calculateSixDigitClock(0, 0, 0, 7, 8, 9));
        assertEquals("17:28:29", sixDigitClock.calculateSixDigitClock(2, 1, 2, 7, 8, 9));
        assertEquals("NOT POSSIBLE", sixDigitClock.calculateSixDigitClock(2, 4, 5, 9, 5, 9));
        assertEquals("12:36:48", sixDigitClock.calculateSixDigitClock(1, 8, 3, 2, 6, 4));
        assertEquals("NOT POSSIBLE", sixDigitClock.calculateSixDigitClock(5, 5, 5, 5, 5, 5));
    }
}