package net.ensan.codest.codility;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class TapeEquilibrium {

    public int solution(int[] A) {
        if (A.length == 2) {
            return abs(A[0] - A[1]);
        }
        int head = A[0];
        int tail = 0;
        for (int i = 1; i < A.length ; i++) {
            tail += A[i];
        }
        int minDif = abs(head - tail);
        for (int i = 1 ; i < A.length - 1 ; i++) {
            head += A[i];
            tail -= A[i];
            minDif = min(minDif, abs(head - tail));
        }
        return minDif;
    }
}
