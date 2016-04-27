package com.mrensan.codest.bas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Calculates the BinaryGAP in a desired number.
 *
 * @author shahram at gmail.com
 */
public class BinaryGap {

    public int calculateBinaryGap(int n) {

        StringBuilder bin = new StringBuilder();
        List<Integer> binaryGap = new ArrayList<>();
        int currentBG = 0;
        boolean canCount = false;
        int remain;

        do {
            remain = n % 2;
            n = n / 2;
            bin.insert(0, remain);

            if (remain == 1 && !canCount) {
                canCount = true;
            } else if (remain == 1 && canCount) {
                canCount = false;
                binaryGap.add(currentBG);
                currentBG = 0;
            } else if(canCount) {
                currentBG++;
            }

        } while (n > 0);

        if (binaryGap.size() == 0) {
            return 0;
        }
        return Collections.max(binaryGap);
    }
}
