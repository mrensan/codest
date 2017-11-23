package net.ensan.codest.codility;

import java.util.Stack;

/**
 * Calculates the Fish.
 * Lesson Seven in codility.com Lessons
 *
 * @author shahram at gmail.com
 * Inspired from:
 * https://codesays.com/solutions-to-training-by-codility
 */
public class Fish {

    public int calculateFish(int[] A, int[] B) {
        int aliveCount = 0;
        Stack<Integer> downStream = new Stack<Integer>();

        for (int index = 0 ; index < A.length ; index++) {
            if (B[index] == 1) {
                // This fish is flowing downstream. It would
                // NEVER meet the previous fish. But possibly
                // it has to fight with the downstream fish.
                downStream.push(A[index]);
            } else {
                // This fish is flowing upstream. It would either
                //    eat ALL the previous downstream-flow fish,
                //    and stay alive.
                // OR
                //    be eaten by ONE of the previous downstream-
                //    flow fish, which is bigger, and died.
                while (downStream.size() != 0) {
                    if (downStream.peek() < A[index]) {
                        // Win and to continue the next fight
                        downStream.pop();
                    } else {
                        // Lose and die
                        break;
                    }
                }
                if (downStream.size() == 0) {
                    // This upstream-flow fish eat all the previous
                    // downstream-flow fishs. Win and stay alive.
                    aliveCount++;
                }
            }
        }
        // Currently, all the downstream-flow fishs in stack
        // downstream will not meet with any fish. They will
        // stay alive.
        aliveCount += downStream.size();
        return aliveCount;
    }
}
