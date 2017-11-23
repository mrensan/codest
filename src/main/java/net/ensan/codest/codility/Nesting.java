package net.ensan.codest.codility;

/**
 * Calculates the Nesting of a given String is properly nested.
 * Lesson Seven in codility.com Lessons
 *
 * @author shahram at gmail.com
 * Inspired from:
 * https://codesays.com/solutions-to-training-by-codility
 */
public class Nesting {

    public int calculateNesting(String S) {
        if (S.length() % 2 == 1) {
            return 0;
        }
        int parentheses = 0;
        for (Character element: S.toCharArray()) {
            if (element.equals('(')) {
                parentheses++;
            } else {
                parentheses--;
                if (parentheses < 0) {
                    return 0;
                }
            }
        }
        if (parentheses == 0) {
            return 1;
        }
        return 0;
    }
}
