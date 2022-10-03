package net.ensan.codest.codility.countingelements;

/**
 * Inspired from:
 * https://codesays.com/solutions-to-training-by-codility
 */
public class MissingInteger {

    public int solution(int[] A) {
        // We only care about the first N+1 positive integers.
        // occurrence[i] is for the integer i+1.
        int[] occurrences = new int[A.length + 1];
        for (int item: A) {
            if (item >= 1 && item <= A.length + 1) {
                occurrences[item - 1] = 1;
            }
        }
        // Find out the missing minimal positive integer
        for (int i = 0 ; i < A.length + 1 ; i++) {
            if (occurrences[i] == 0) {
                return i + 1;
            }
        }
        // should never be here
        return -1;
    }
}
