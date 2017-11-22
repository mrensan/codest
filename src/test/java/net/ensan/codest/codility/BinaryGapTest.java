package net.ensan.codest.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {
    @Test
    public void calculateBinaryGap() throws Exception {
        BinaryGap binaryGap = new BinaryGap();
        int gap1 = binaryGap.calculateBinaryGap(1610612737);
        int gap5 = binaryGap.calculateBinaryGap(45634);
        int gap2 = binaryGap.calculateBinaryGap(1041);
        int gap3 = binaryGap.calculateBinaryGap(16);
        int gap4 = binaryGap.calculateBinaryGap(29);

        assertEquals("BinaryGap", 28, gap1);
        assertEquals("BinaryGap", 4, gap5);
        assertEquals("BinaryGap", 5, gap2);
        assertEquals("BinaryGap", 0, gap3);
        assertEquals("BinaryGap", 1, gap4);
    }

    @Test
    public void calculateBinaryGap2() throws Exception {
        BinaryGap binaryGap = new BinaryGap();
        int gap1 = binaryGap.calculateBinaryGap2(1610612737);
        int gap5 = binaryGap.calculateBinaryGap2(45634);
        int gap2 = binaryGap.calculateBinaryGap2(1041);
        int gap3 = binaryGap.calculateBinaryGap2(16);
        int gap4 = binaryGap.calculateBinaryGap2(29);

        assertEquals("BinaryGap", 28, gap1);
        assertEquals("BinaryGap", 4, gap5);
        assertEquals("BinaryGap", 5, gap2);
        assertEquals("BinaryGap", 0, gap3);
        assertEquals("BinaryGap", 1, gap4);
    }

}