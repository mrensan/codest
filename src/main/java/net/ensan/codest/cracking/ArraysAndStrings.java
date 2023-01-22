package net.ensan.codest.cracking;

public class ArraysAndStrings {

    // assumption: only ascii characters
    public boolean hasAllUniqueCharacters(final String data) {
        if (data.length() > 128)
            return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < data.length(); i++) {
            int val = data.charAt(i);
            if (char_set[val]) // already found this char in string
                return false;
            char_set[val] = true;
        }
        return true;
    }

    public boolean isPermutation(final String data, final String permutation) {
        if (data.length() != permutation.length()) {
            return false;
        }
        int[] letters = new int[128];
        for (char c: data.toCharArray()) {
            letters[c]++;
        }
        for(char c: permutation.toCharArray()) {
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Write a method to replace all spaces in a string with '%20'. You may assume that the string has
     * sufficient space at the end to hold the additional characters,and that you are given the "true"
     * length of the string.
     * (Note: If implementing in Java,please use a character array so that you can perform this
     * operation in place.)
     */
    public String urlify(String data, int realLength) {
        char[] input = data.toCharArray();
        char[] result = new char[input.length];
        int resultIndex = 0;
        for(int i = 0; i < realLength; i++) {
            if (input[i] == 32) {
                result[resultIndex++] = '%';
                result[resultIndex++] = '2';
                result[resultIndex++] = '0';
            } else {
                result[resultIndex++] = input[i];
            }
        }
        return new String(result);
    }

    /**
     * Given an image represented by an NxN matrix,
     * where each pixel in the image is 4 bytes,
     * write a method to rotate the image by 90 degrees.
     * Can you do this in place?
     */
    public boolean rotateMatrix(int[][] m) {
        int n = m.length;
        if (n < 1 || n != m[0].length) {
            return false;
        }
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int top = m[first][i];
                // left to top
                m[layer][i] = m[last - i + first][first];
                // bottom to left
                m[last - i + first][first] = m[last][last - i + first];
                // right to bottom
                m[last][last - i + first] = m[i][last];
                // top to right
                m[i][last] = top;
            }
        }
        return true;
    }
}
