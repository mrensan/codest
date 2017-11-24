package net.ensan.codest.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class FourDigitClockTest {
    @Test
    public void calculateFourDigitClock() throws Exception {
        FourDigitClock fourDigitClock = new FourDigitClock();
        assertEquals("00:00", fourDigitClock.calculateFourDigitClock(0, 0, 0, 0));
        assertEquals("08:07", fourDigitClock.calculateFourDigitClock(0, 0, 8, 7));
        assertEquals("19:43", fourDigitClock.calculateFourDigitClock(4, 9, 3, 1));
        assertEquals("21:49", fourDigitClock.calculateFourDigitClock(4, 9, 1, 2));
        assertEquals("23:19", fourDigitClock.calculateFourDigitClock(2, 3, 9, 1));
    }

}