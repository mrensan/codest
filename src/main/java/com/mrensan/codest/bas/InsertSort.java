package com.mrensan.codest.bas;

import java.util.LinkedList;
import java.util.List;

/**
 * Simple implementation of bubble sort.
 *
 * <br/>Inspired from:<br/>
 * <a href="http://www.wrox.com/WileyCDA/WroxTitle/Java-Programming-Interviews-Exposed.productCd-1118722868.html">reference</a>
 *
 * @author shahram at gmail.com
 */
public class InsertSort {

    public List<Integer> insertSort(final List<Integer> numbers) {
        final List<Integer> sortedList = new LinkedList<>();

        originalList:
        for (Integer number : numbers) {
            for (int i = 0; i < sortedList.size(); i++) {
                if (number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue originalList;
                }
            }
            sortedList.add(sortedList.size(), number);
        }
        return sortedList;
    }

}
