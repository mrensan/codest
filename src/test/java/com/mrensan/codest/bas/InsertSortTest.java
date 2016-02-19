package com.mrensan.codest.bas;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.*;

/**
 * Tests {@code InserSort} Class.
 *
 */
public class InsertSortTest {
    private List<Integer> numbers;
    private List<Integer> expected;

    @Before
    public void prepareData() {
        numbers = Arrays.asList(new Integer[] {6,2, 1, 0, 8, 9, 13});
        expected = Arrays.asList(new Integer[] {0, 1, 2, 6, 8, 9, 13});
    }

    @Test
    public void doSortTest() {
        InsertSort insertSort = new InsertSort();
        numbers = insertSort.insertSort(numbers);

        assertTrue("numbers and expected lists are not equal.", Arrays.equals(numbers.toArray(), expected.toArray()));
    }

}