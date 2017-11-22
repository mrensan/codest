package net.ensan.codest.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Calculates the OddOccurrencesInArray from a desired array.
 * Lesson Two in codility.com Lessons
 *
 * @author shahram at gmail.com
 * Inspired from:
 * https://codesays.com/solutions-to-training-by-codility
 */
public class OddOccurrencesInArray {

    public int calculateOddOccurrencesInArray(int[] A) {
        int result = 0;
        for (int i = 0 ; i < A.length ; i++) {
            result ^= A[i];
        }
        return result;
    }
}
