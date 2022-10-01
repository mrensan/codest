package net.ensan.codest.codility;

public class FrogJump {
    public int solution(int X, int Y, int D) {
        int diff = Y - X;
        if (diff % D == 0) {
            return diff / D;
        }
        return diff / D + 1;
    }
}
