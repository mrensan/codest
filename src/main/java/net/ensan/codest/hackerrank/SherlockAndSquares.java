package net.ensan.codest.hackerrank;

public class SherlockAndSquares {

    public int squares(int a, int b) {
        int compensation = 0;
        int aSqrt = (int)Math.sqrt(a);
        int bSqrt = (int)Math.sqrt(b);
        if (Math.sqrt(a) == Math.floor(Math.sqrt(a))) {
            compensation++;
        }
        return bSqrt - aSqrt + compensation;
    }
}
