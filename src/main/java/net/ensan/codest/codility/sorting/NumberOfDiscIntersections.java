package net.ensan.codest.codility.sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    public int solution(int[] A) {
        int N = A.length;
        long[] starts = new long[N];
        long[] ends = new long[N];

        for(int i = 0; i < N; i++) {
            starts[i] = i - (long)A[i];
            ends[i] = i + (long)A[i];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int intersections = 0;
        int activeCircles = 0;
        int j = 0;

        for (int i = 0 ; i < N ; i++) {
            while (j < N && starts[j] <= ends[i]) {
                intersections += activeCircles;
                activeCircles++;
                if (intersections > 10_000_000) {
                    return -1;
                }
                j++;
            }
            activeCircles--;
        }
        return intersections;
    }
}
