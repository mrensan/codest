package com.mrensan.codest.bas;

import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Tests {@code AsteriskForLoop} class.
 */
public class AsteriskForLoopTest {

    @Test
    public void simpleTriangleAsteriskTest() {
        AsteriskForLoop asteriskForLoop = new AsteriskForLoop();
        asteriskForLoop.simpleTriangleAsterisk(4);
        System.out.println();
        asteriskForLoop.simpleTriangleAsterisk(10);

        assertTrue("look at the printed output and check its vision with wanter triangle!", true);
    }

    @Test
    public void symmetricalTriangleAsterisk() {
        AsteriskForLoop asteriskForLoop = new AsteriskForLoop();
        asteriskForLoop.symmetricalTriangleAsterisk(4);
        System.out.println();
        asteriskForLoop.symmetricalTriangleAsterisk(10);

        assertTrue("look at the printed output and check its vision with wanter triangle!", true);
    }
}
