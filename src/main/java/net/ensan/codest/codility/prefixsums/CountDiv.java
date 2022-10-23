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
}
