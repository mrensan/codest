package com.mrensan.codest.bas;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.*;

/**
 * Tests {@code BubbleSort} class.
 *
 */
public class BubbleSortTest {

    private int[] numbers;
    private int[] expected;

    @Before
    public void prepareData() {
        numbers = new int[] {6,2, 1, 0, 8, 9, 13};
        expected = new int[] {0, 1, 2, 6, 8, 9, 13};
    }

    @Test
    public void doSortTest() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doSort(numbers);

        assertTrue("numbers and expected arrays are not equal.", Arrays.equals(numbers, expected));
    }
}
