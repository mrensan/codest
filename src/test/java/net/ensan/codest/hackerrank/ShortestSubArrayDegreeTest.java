package net.ensan.codest.hackerrank;

import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class ShortestSubArrayDegreeTest {

    private final ShortestSubArrayDegree shortestSubArrayDegree = new ShortestSubArrayDegree();

    @ParameterizedTest
    @CsvSource({
            "'1, 2, 1, 3, 2', 3",
            "'1, 2, 2, 1', 2",
            "'7, 8, 1, 3, 8, 2, 1, 10', 4"
    })
    void calculateShouldReturnShortestSubArrayDegree(@ConvertWith(IntegerArrayConverter.class) int[] arr, int expected) {
        assertThat(shortestSubArrayDegree.calculate(Arrays.stream(arr).boxed().collect(Collectors.toList())))
                .isEqualTo(expected);
    }

    @Test
    void calculateWhenListIsEmptyShouldReturnZero() {
        assertThat(shortestSubArrayDegree.calculate(Collections.emptyList()))
                .isZero();
    }

    @Test
    void calculateWhenListIsNullShouldReturnZero() {
        assertThat(shortestSubArrayDegree.calculate(null))
                .isZero();
    }
}