package net.ensan.codest.codility.stacksqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Nesting {

    public int solution(String S) {
        if (S.isEmpty()) {
            return 1;
        }
        if (S.length() % 2 == 1) {
            return 0;
        }
        final Deque<Character> checkStack = new ArrayDeque<>();
        for (char theChar : S.toCharArray()) {
            if (theChar == '(') {
                checkStack.push(theChar);
            } else {
                if (checkStack.isEmpty()) {
                    return 0;
                }
                char opening = checkStack.pop();
                if (theChar != ')' || opening != '(') {
                    return 0;
                }
            }
        }
        if (!checkStack.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
