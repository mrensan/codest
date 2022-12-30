package net.ensan.codest.cracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortMethodsTest {

    private final SortMethods sortMethods = new SortMethods();
    private int[] data;

    @BeforeEach
    void setup() {
        data = new int[] {92, 56, 0, 4, 91, 40, 2, 6, 72, 1};
    }

    @Test
    void bubbleSort() {
        sortMethods.bubbleSort(data);
        assertThat(data).isSorted();
    }

    @Test
    void mergeSort() {
        sortMethods.mergeSort(data);
        assertThat(data).isSorted();
    }
}