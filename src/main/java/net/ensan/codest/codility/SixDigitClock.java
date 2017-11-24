package net.ensan.codest.codility;

import java.util.Arrays;
import java.util.Formatter;

/**
 * A problem from Codility real interview challenge that I called
 * it {@code SixDigitClock}
 *
 * <h2>Problem Description:</h2>
 * <p>Given the six digits, find the earliest valid time that can be displayed
 * on a digital clock (in 24-hour format) using those digits. For example, given
 * digits 1, 8, 3, 2, 6, 4 the earliest valid time is {@code "12:36:48"}. Note
 * that {@code "12:34:68"} is not a valid time.
 *
 * <p>Write a function:
 * <pre>{@code
 *      class Solution { public String solution(int A, int B,
 *      int C, int D, int E, int F); }
 * }</pre>
 *
 * <p>that given six integers A, B, C, D, E and F, returns the earliest valid time
 * in {@code "HH:MM:SS"} string format, or {@code "NOT POSSIBLE"} if it is not
 * possible to display a valid time using all six integers.
 *
 * <p>For example, given 1, 8, 3, 2, 6, 4 the function should return {@code "12:36:48"}.
 *
 * <p>Given 0, 0, 0, 0, 0, 0, the function should return {@code "00:00:00"}.
 * <p>Given 0, 0, 0, 7, 8, 9, the function should return {@code "07:08:09"}.
 * <p>Given 2, 4, 5, 9, 5, 9, the function should return {@code "NOT POSSIBLE"}.
 *
 * <p>Assume that:
 * <ul>
 *     <li>A, B, C, D, E and F are integers within the range [0..9].</li>
 * </ul>
 *
 * <p>In your solution, focus on <b>Correctness</b>. The performance of your
 * solution will not be the focus of this assessment.
 *
 *
 * @author shahram at gmail.com
 */
public class SixDigitClock {

    public String calculateSixDigitClock(int A, int B, int C, int D, int E, int F) {
        Integer[] data = new Integer[] {A, B, C, D, E, F};
        Arrays.sort(data);

        for(int i = data.length - 1 ; i >= 0; i--) {
            int j = i - 1;
            while (!checkCondition(i, data)) {
                if (j < 0) {
                    return "NOT POSSIBLE";
                }
                replaceNext(i, j, data);
                j--;
            }
        }
        return new Formatter().format("%d%d:%d%d:%d%d", data[0], data[1], data[2], data[3], data[4], data[5]).toString();
    }

    private boolean checkCondition(int index, Integer[] data) {
        switch (index) {
            case 5:
                return true;
            case 4:
                if (data[index] <= 5) {
                    return true;
                }
                break;
            case 3:
                return true;
            case 2:
                if (data[index] <= 5) {
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
            case 0:
                if (data[index] <= 2) {
                    return true;
                }
                break;
        }
        return false;
    }

    private void replaceNext(int i , int j, Integer[] data) {
        int swap = data[i];
        data[i] = data[j];
        data[j] = swap;
    }
}
