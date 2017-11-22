package net.ensan.codest.codility;

/**
 * Calculates the CyclicRotation.
 * Lesson Two in codility.com Lessons
 *
 * @author shahram at gmail.com
 */
public class CyclicRotation {

    public int[] calculateCyclicRotation(int[] A, int K) {
        int[] result = new int[A.length];

        for (int i = 0 ; i < A.length ; i++) {
            int shift = K + i;
            if (shift >= A.length) {
                int lengthMultiplier = shift / A.length;
                for (int j = 0 ; j < lengthMultiplier ; j++) {
                    shift -= A.length;
                }
            }
            result[shift] = A[i];
        }
        return result;
    }
}
