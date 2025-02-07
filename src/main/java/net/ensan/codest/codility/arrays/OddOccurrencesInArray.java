package net.ensan.codest.codility.arrays;

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
        for (final int i : A) {
            result ^= i;
        }
        return result;
    }
}
