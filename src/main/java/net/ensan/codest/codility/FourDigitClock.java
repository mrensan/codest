package net.ensan.codest.codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;

/**
 * A problem like as {@link SixDigitClock} just with 4 digits and returns
 * the maximum time that can be shown on the clock in 24-hour format.
 *
 * <p>Format: {@code "HH:MM"}
 *
 * @author shahram at gmail.com
 */
public class FourDigitClock {

    public String calculateFourDigitClock(int A, int B, int C, int D) {
        Integer[] data = new Integer[] {A, B, C, D};
        Arrays.sort(data, Collections.reverseOrder());

        for(int i = 0 ; i < data.length; i++) {
            int j = i + 1;
            while (!checkCondition(i, data)) {
                if (j == data.length) {
                    return "NOT POSSIBLE";
                }
                replaceNext(i, j, data);
                j++;
            }
        }
        return new Formatter().format("%d%d:%d%d", data[0], data[1], data[2], data[3]).toString();
    }

    private boolean checkCondition(int index, Integer[] data) {
        switch (index) {
            case 0:
                if (data[index] <= 2) {
                    return true;
                }
                break;
            case 1:
                if (data[index - 1] == 2 && data[index] <= 3) {
                    return true;
                } else if (data[index - 1] < 2) {
                    return true;
                }
                break;
            case 2:
                if (data[index] <= 5) {
                    return true;
                }
                break;
            case 3:
                return true;
        }
        return false;
    }

    private void replaceNext(int i , int j, Integer[] data) {
        int swap = data[i];
        data[i] = data[j];
        data[j] = swap;
    }
}
