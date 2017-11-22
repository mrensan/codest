package net.ensan.codest.codility;

import java.util.*;

/**
 * Calculates the Brackets of a given String is properly nested.
 * Lesson Seven in codility.com Lessons
 *
 * @author shahram at gmail.com
 * Inspired from:
 * https://codesays.com/solutions-to-training-by-codility
 */
public class Brackets {

    public int calculateBrackets(String S) {
        if (S.length() % 2 == 1) {
            return 0;
        }
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> matched = new HashMap<>();
        matched.put(']', '[');
        matched.put('}', '{');
        matched.put(')', '(');
        List<Character> toPush = Arrays.asList('[', '{', '(');

        for (Character element: S.toCharArray()) {
            if (toPush.contains(element)) {
                stack.push(element);
            } else {
                if (stack.size() == 0) {
                    return 0;
                } else if (!matched.get(element).equals(stack.pop()) ) {
                    return 0;
                }
            }
        }
        if (stack.size() == 0) {
            return 1;
        }
        return 0;
    }
}
