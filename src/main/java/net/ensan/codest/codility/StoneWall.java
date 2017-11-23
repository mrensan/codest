package net.ensan.codest.codility;

import java.util.Stack;

/**
 * Calculates the StoneWall of a given Array.
 * Lesson Seven in codility.com Lessons
 *
 * @author shahram at gmail.com
 * Inspired from:
 * https://codesays.com/solutions-to-training-by-codility
 */
public class StoneWall {

    public int calculateStoneWall(int[] H) {
        int blockCount = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0 ; i < H.length ; i++ ) {
            while (stack.size() != 0 && H[i] < stack.peek()) {
                // If the height of current block is less than
                // the previous ones, the previous ones have
                // to end before current point. They have no
                // chance to exist in the remaining part.
                // So the previous blocks are completely finished.
                stack.pop();
                blockCount++;
            }
            if (stack.size() == 0 || H[i] > stack.peek()) {
                // If the height of current block is greater than
                // the previous one, a new block is needed for
                // current position.
                stack.push(H[i]);
            }
            // Else (the height of current block is same as that
            // of previous one), they should be combined to
            // one block.
        }
        // Some blocks with different heights are still in the stack.
        blockCount += stack.size();
        return blockCount;
    }
}
