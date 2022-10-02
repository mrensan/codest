package net.ensan.codest.codility;

public class PermMissingElem {
    /**
     * Was inspired from:
     * https://codesays.com/solutions-to-training-by-codility
     */
    public int solution(int[] A) {
        int length = A.length;
        int xorSum = 0;
        for(int i = 0 ; i < length ; i++) {
            xorSum = xorSum ^ A[i] ^ (i + 1);
        }
        return xorSum ^ (length + 1);
    }
}
