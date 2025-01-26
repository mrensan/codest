package net.ensan.codest.codility.prefixsums;

import java.util.Arrays;
public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int len = S.length();
        int[][] prefixSum = new int[4][len];
        Arrays.fill(prefixSum[0], -1);
        Arrays.fill(prefixSum[1], -1);
        Arrays.fill(prefixSum[2], -1);
        Arrays.fill(prefixSum[3], -1);
        prefixSum[impactFactor(S.charAt(len - 1)) - 1][len - 1] =  len - 1;
        for (int i = len - 2 ; i > -1 ; i--) {
            prefixSum[0][i] = prefixSum[0][i + 1];
            prefixSum[1][i] = prefixSum[1][i + 1];
            prefixSum[2][i] = prefixSum[2][i + 1];
            prefixSum[3][i] = prefixSum[3][i + 1];
            prefixSum[impactFactor(S.charAt(i)) - 1][i] = i;
        }
        for (int i = 0 ; i < P.length ; i++) {
            if (prefixSum[0][P[i]] != -1 && prefixSum[0][P[i]] <= Q[i]) {
                result[i] = 1;
            } else if (prefixSum[1][P[i]] != -1 && prefixSum[1][P[i]] <= Q[i]) {
                result[i] = 2;
            } else if (prefixSum[2][P[i]] != -1 && prefixSum[2][P[i]] <= Q[i]) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }
        return result;
    }

    private int impactFactor(char theChar) {
        switch (theChar) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
        }
        return 4;
    }
}
