package net.ensan.codest.codility.stacksqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {

    public int solution(String S) {
        if (S.isEmpty()) {
            return 1;
        }
        if (S.length() % 2 == 1) {
            return 0;
        }
        final Deque<Character> checkStack = new ArrayDeque<>();
        for (char theChar : S.toCharArray()) {
            if (charIsOpening(theChar)) {
                checkStack.push(theChar);
            } else {
                if (checkStack.isEmpty()) {
                    return 0;
                }
                char opening = checkStack.pop();
                if (!openingMatches(opening, theChar)) {
                    return 0;
                }
            }
        }
        if (!checkStack.isEmpty()) {
            return 0;
        }
        return 1;
    }

    private boolean openingMatches(final char opening, final char theChar) {
        return (theChar == ')' && opening == '(') || (theChar == ']' && opening == '[') ||
            (theChar == '}' && opening == '{');
    }

    private boolean charIsOpening(final char theChar) {
        return theChar == '(' || theChar == '[' || theChar == '{';
    }
}
