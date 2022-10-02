package net.ensan.codest.codility;

import java.util.Arrays;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        int[] coveredTime = new int[X];
        Arrays.fill(coveredTime, -1);
        int uncovered = X;
        for (int i = 0 ; i < A.length ; i++) {
            if (A[i] - 1 < X) {
                if (coveredTime[A[i] - 1] == -1) {
                    coveredTime[A[i] - 1] = i;
                    uncovered--;
                    if (uncovered == 0) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
