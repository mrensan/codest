package com.mrensan.codest.bas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by shahram on 4/25/16.
 */
public class BinaryGap {

    public int calculateBinaryGap(int n) {

        StringBuilder bin = new StringBuilder();
        List<Integer> binaryGap = new ArrayList<>();
        int currentBG = 0;
        boolean canCount = false;

        while ((n = n / 2 )> 0) {
            int remain = n % 2;
            bin.insert(0, remain);
            if (remain == 1 && !canCount) {
                canCount = true;
            } else if (remain == 1 && canCount) {
                canCount = false;
                binaryGap.add(currentBG);
                currentBG = 0;
            } else {
                currentBG++;
            }
        }

        binaryGap.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        return 0;
    }
}
