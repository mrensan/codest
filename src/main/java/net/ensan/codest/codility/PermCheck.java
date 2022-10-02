package net.ensan.codest.codility;

public class PermCheck {

    public int solution(int[] A) {
        int[] counter = new int[A.length];
        for (final int i : A) {
            if (i < 1 || i > A.length) {
                return 0; // out of range
            } else if (counter[i - 1] == 1) {
                return 0; // met before
            } else {
                counter[i - 1] = 1; // first time meet
            }
        }
        return 1;
    }
}
