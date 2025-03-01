package net.ensan.codest.codility.stacksqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Fish {

    public int solution(int[] A, int[] B) {
        if (A.length == 0) {
            return 0;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        int numAlive = A.length;

        for (int i = 0 ; i < A.length; i++) {

            if (B[i] == 1) {
                stack.push(A[i]);
            } else {
                while (!stack.isEmpty()) {
                    if (stack.peek() > A[i]) {
                        numAlive--;
                        break;
                    } else {
                        numAlive--;
                        stack.pop();
                    }
                }
            }
        }
        return numAlive;
    }

}
