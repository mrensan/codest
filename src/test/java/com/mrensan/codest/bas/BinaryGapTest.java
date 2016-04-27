package com.mrensan.codest.bas;

import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Tests {@code BinaryGap} class.
 *
 */
public class BinaryGapTest {

    @Test
    public void calculateBinaryGapTest() {
        BinaryGap binaryGap = new BinaryGap();
        int gap1 = binaryGap.calculateBinaryGap(45633);
        int gap2 = binaryGap.calculateBinaryGap(15);
        int gap3 = binaryGap.calculateBinaryGap(16);
        int gap4 = binaryGap.calculateBinaryGap(29);

        assertEquals("BinaryGap", 5, gap1);
        assertEquals("BinaryGap", 0, gap2);
        assertEquals("BinaryGap", 0, gap3);
        assertEquals("BinaryGap", 1, gap4);
    }
}
