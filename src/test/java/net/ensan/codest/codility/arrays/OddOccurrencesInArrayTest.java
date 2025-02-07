package net.ensan.codest.codility.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurrencesInArrayTest {
    @Test
    public void calculateOddOccurrencesInArray() throws Exception {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        assertEquals(5, oddOccurrencesInArray.calculateOddOccurrencesInArray(new int[]{5}));
        assertEquals(5, oddOccurrencesInArray.calculateOddOccurrencesInArray(new int[]{5,1,1}));
        assertEquals(7, oddOccurrencesInArray.calculateOddOccurrencesInArray(new int[]{9,3,9,3,9,7,9}));
    }
}
