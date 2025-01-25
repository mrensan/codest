package net.ensan.codest.codility.prefixsums;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int firstDivisible = A;
        int firstDivisibleValue = 0;
        for (int i = A ; i <= B ; i++) {
            if (i % K == 0) {
                firstDivisible = i;
                firstDivisibleValue++;
                break;
            }
        }
        return (B - firstDivisible) / K + firstDivisibleValue;
    }

    public int solution2(int A, int B, int K) {
        int upperMultipleCount = B / K;
        int lowerMultipleCount = 0;
        int zeroBoundaryOverhead = 0;
        if (A > 0) {
            lowerMultipleCount = (A - 1) / K;
        } else if (A == 0) {
            zeroBoundaryOverhead = 1;
        }
        return (upperMultipleCount - lowerMultipleCount) + zeroBoundaryOverhead;
    }
}
