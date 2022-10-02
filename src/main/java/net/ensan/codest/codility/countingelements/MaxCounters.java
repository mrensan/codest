package net.ensan.codest.codility.countingelements;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int currentMax = 0; // the used value in previous max_counter command
        int maxCounter = 0; // the current maximum value of any counter
        for(int i: A) {
            if (i <= N) { // increase x command
                if (maxCounter > counters[i - 1]) {
                    // lazy write
                    counters[i - 1] = maxCounter;
                }
                counters[i - 1]++;
                if (currentMax < counters[i - 1]) {
                    currentMax = counters[i - 1];
                }
            } else { // max_counter command
                // just record the current max value for later write
                maxCounter = currentMax;
            }
        }
        for (int i = 0 ; i < N ; i++) {
            if (counters[i] < maxCounter) {
                // this element has never been used/updated after previous max_counter command
                counters[i] = maxCounter;
            }
        }
        return counters;
    }
}
