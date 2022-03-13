package net.ensan.codest.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class CyclicRotationTest {
    @Test
    public void calculateCyclicRotation() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        assertArrayEquals(new int[] {}, cyclicRotation.calculateCyclicRotation(new int[] {}, 3));
        assertArrayEquals(new int[] {1}, cyclicRotation.calculateCyclicRotation(new int[] {1}, 3));
        assertArrayEquals(new int[] {9,1}, cyclicRotation.calculateCyclicRotation(new int[] {1,9}, 3));
        assertArrayEquals(new int[] {7,2,11,5,1}, cyclicRotation.calculateCyclicRotation(new int[] {5,1,7,2,11}, 3));
        assertArrayEquals(new int[] {5,1,7,2,11}, cyclicRotation.calculateCyclicRotation(new int[] {5,1,7,2,11}, 5));
        assertArrayEquals(new int[] {5,1,7,2,11}, cyclicRotation.calculateCyclicRotation(new int[] {5,1,7,2,11}, 50));

    }

    @Test
    public void calculateCyclicRotation2() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        assertArrayEquals(new int[] {}, cyclicRotation.calculateCyclicRotation2(new int[] {}, 3));
        assertArrayEquals(new int[] {1}, cyclicRotation.calculateCyclicRotation2(new int[] {1}, 3));
        assertArrayEquals(new int[] {9,1}, cyclicRotation.calculateCyclicRotation2(new int[] {1,9}, 3));
        assertArrayEquals(new int[] {7,2,11,5,1}, cyclicRotation.calculateCyclicRotation2(new int[] {5,1,7,2,11}, 3));
        assertArrayEquals(new int[] {5,1,7,2,11}, cyclicRotation.calculateCyclicRotation2(new int[] {5,1,7,2,11}, 5));
        assertArrayEquals(new int[] {5,1,7,2,11}, cyclicRotation.calculateCyclicRotation2(new int[] {5,1,7,2,11}, 50));

    }

}
