package net.ensan.codest.hackerrank;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.LinkedList;
import java.util.ArrayList;

/**
 * The degree in an array is most occurrences of an element.
 * For example in this array [1, 2, 1, 3, 2] since the element
 * 1 and 2 are occurred 2 times the degree is 2. We can split
 * the array to some sub array so that they also present the
 * same degree, e.g. for our example:
 * 1. [1, 2, 1] that degree is 2
 * 2. [2, 1, 3, 2] that degree is 2
 * Find the length of the shortest sub array with same degree
 * of given array. So in the above example the answer is 3.
 */
public class ShortestSubArrayDegree {

    public int calculate(final List<Integer> arr) {
        if (Objects.isNull(arr) || arr.isEmpty()) {
            return 0;
        }
        final Map<Integer, List<Integer>> indexes = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> currentList = indexes.get(arr.get(i));
            if (Objects.isNull(currentList)) {
                currentList = new LinkedList<>();
            }
            currentList.add(i);
            indexes.put(arr.get(i), currentList);
        }
        final List<List<Integer>> indexValues = new ArrayList<>(indexes.values());
        int maxValue = 0;
        final List<Integer> maxValueIndexes = new ArrayList<>();
        for (int i = 0; i < indexValues.size(); i++) {
            int size = indexValues.get(i).size();
            if (size > maxValue) {
                maxValue = size;
                maxValueIndexes.clear();
                maxValueIndexes.add(i);
            } else if (size == maxValue) {
                maxValueIndexes.add(i);
            }
        }
        int minLen = Integer.MAX_VALUE;
        for (Integer maxValueIndex : maxValueIndexes) {
            List<Integer> currentList = indexValues.get(maxValueIndex);
            int currentLen = currentList.get(currentList.size() - 1) - currentList.get(0) + 1;
            if (currentLen < minLen) {
                minLen = currentLen;
            }
        }
        return minLen;
    }
}
