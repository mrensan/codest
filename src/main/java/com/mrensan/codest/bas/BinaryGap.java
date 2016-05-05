package com.mrensan.codest.bas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Calculates the BinaryGAP in a desired number.
 * Lesson One in Codility Lessons
 *
 * @author shahram at gmail.com
 */
public class BinaryGap {

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
}
