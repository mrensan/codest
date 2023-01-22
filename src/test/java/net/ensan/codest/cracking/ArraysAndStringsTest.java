package net.ensan.codest.cracking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArraysAndStringsTest {

    final private ArraysAndStrings arraysAndStrings = new ArraysAndStrings();

    @Test
    void testRotateMatrixWithLengthFive() {
        int[][] m = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        int[][] expected = new int[][]{
                {21, 16, 11, 6, 1},
                {22, 17, 12, 7, 2},
                {23, 18, 13, 8, 3},
                {24, 19, 14, 9, 4},
                {25, 20, 15, 10, 5},
        };
        assertThat(arraysAndStrings.rotateMatrix(m)).isTrue();
        assertThat(m).isEqualTo(expected);
    }

    @Test
    void testRotateMatrixWithLengthOne() {
        int[][] m = new int[][]{
                {1},
        };
        int[][] expected = new int[][]{
                {1},
        };
        assertThat(arraysAndStrings.rotateMatrix(m)).isTrue();
        assertThat(m).isEqualTo(expected);
    }

    @Test
    void testRotateMatrixWithNotEqualDimensions() {
        int[][] m = new int[][]{
                {1, 2},
        };
        assertThat(arraysAndStrings.rotateMatrix(m)).isFalse();
    }
}