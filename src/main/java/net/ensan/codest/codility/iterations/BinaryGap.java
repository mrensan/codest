package net.ensan.codest.codility.iterations;

/**
 * Calculates the BinaryGAP in a desired number.
 * Lesson One in codility.com Lessons
 *
 * @author shahram at gmail.com
 */
public class BinaryGap {

    /**
     * Implementation One
     */
    public int calculateBinaryGap(int N) {

        int binaryGap = 0;
        int currentBG = 0;
        boolean canCount = false;
        int remain;
        int oldRemain = 0;

        do {
            remain = N % 2;
            N = N / 2;

            if (!canCount && oldRemain == 1) {
                canCount = true;
            }
            if (remain == 1 && !canCount) {
                canCount = true;
            } else if (remain == 1 && canCount) {
                canCount = false;
                if (currentBG > binaryGap) {
                    binaryGap = currentBG;
                }
                currentBG = 0;
            } else if(canCount) {
                currentBG++;
            }
            oldRemain = remain;

        } while (N > 0);

        return binaryGap;
    }

    /**
     * Implementation Two.
     * Inspired from:
     * https://codesays.com/solutions-to-training-by-codility
     *
     */
    public int calculateBinaryGap2(int N) {
        int maxGap = 0;
        int currentGap = 0;

        // skip the tailing zero(s)
        while (N > 0 && N % 2 == 0) {
            N /= 2;
        }

        while (N > 0) {
            int reminder = N % 2;
            if (reminder == 0) { // inside a gap
                currentGap++;
            } else {
                if (currentGap != 0) {
                    maxGap = Math.max(currentGap, maxGap);
                    currentGap = 0;
                }
            }
            N /= 2;
        }
        return maxGap;
    }

}
