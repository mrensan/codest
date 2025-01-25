package net.ensan.codest.codility.prefixsums;

public class PassingCars {

    public int solution(int[] A) {
        int lastZeros = 0;
        int result = 0;
        for (int a: A) {
            if (a == 0) {
                lastZeros++;
            } else if (a == 1) {
                result += lastZeros;
                if (result > 1000000000) {
                    return -1;
                }
            }
        }
        return result;
    }

    public int solutionOld(int[] A) {
        if (A.length == 1) {
            return 0;
        }
        int oneCount = 0;
        int counter = 0;
        for (final int item: A) {
            if (item == 1) {
                oneCount++;
            }
        }
        boolean firstIsOne = true;
        for (final int item : A) {
            if (firstIsOne && item == 1) {
                oneCount--;
                continue;
            } else {
                firstIsOne = false;
            }
            if (item == 0) {
                counter += oneCount;
                if (counter > 1000000000) {
                    return -1;
                }
            } else {
                oneCount--;
            }
        }
        return counter;
    }

    public int solutionSlow(int[] A) {
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                continue;
            }
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == 1) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
