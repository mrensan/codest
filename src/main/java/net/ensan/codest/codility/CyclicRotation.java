package net.ensan.codest.codility;

/**
 * Calculates the CyclicRotation.
 * Lesson Two in codility.com Lessons
 *
 * @author shahram at gmail.com
 */
public class CyclicRotation {

    public int[] calculateCyclicRotation1(int[] array, int shiftCount) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int shift = shiftCount + i;
            if (shift >= array.length) {
                int lengthMultiplier = shift / array.length;
                for (int j = 0; j < lengthMultiplier; j++) {
                    shift -= array.length;
                }
            }
            result[shift] = array[i];
        }
        return result;
    }

    public int[] calculateCyclicRotation2(int[] array, int shiftCount) {
        if (array.length < 2 || shiftCount == 0) {
            return array;
        }
        shiftCount %= array.length;
        int[] result = new int[array.length];
        System.arraycopy(array, array.length - shiftCount, result, 0, shiftCount);
        System.arraycopy(array, 0, result, shiftCount, array.length - shiftCount);
        return result;
    }

    public int[] calculateCyclicRotation(int[] A, int K) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int new_index = i + K;
            while (new_index >= A.length) {
                new_index -= A.length;
            }
            result[new_index] = A[i];
        }
        return result;
    }
}
