package net.ensan.codest.hackerrank;

/**
 * Append and Delete
 */
public class AppendAndDelete {

    public boolean appendAndDelete(String s, String t, int k) {
        int sLen = s.length();
        int tLen = t.length();

        if (k >= (sLen + tLen)) {
            return true;
        }

        int csc = countCommonStartingChars(s, t);
        int sDiff = sLen - csc;
        int tDiff = tLen - csc;
        return k >= (sDiff + tDiff) && (k - sDiff - tDiff) % 2 == 0;
    }

    private int countCommonStartingChars(String s, String t) {
        int csc = 0;
        for (int i = 0; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                csc++;
            } else {
                return csc;
            }
        }
        return csc;
    }
}
