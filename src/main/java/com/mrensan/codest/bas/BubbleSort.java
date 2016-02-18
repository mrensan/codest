package com.mrensan.codest.bas;

/**
 * Simple implementation of bubble sort.
 *
 * <br/>Inspired from:<br/>
 * <a href="http://www.wrox.com/WileyCDA/WroxTitle/Java-Programming-Interviews-Exposed.productCd-1118722868.html">reference</a>
 *
 * @author shahram at gmail.com
 */
public class BubbleSort {

    public void doSort(int[] numbers) {
        boolean numbersSwitched;
        do {
            numbersSwitched = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i + 1] < numbers[i]) {
                    int tmp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = tmp;
                    numbersSwitched = true;
                }
            }
        } while (numbersSwitched);
    }
}
