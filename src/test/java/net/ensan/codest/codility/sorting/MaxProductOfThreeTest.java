package net.ensan.codest.codility.sorting;

import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProductOfThreeTest {

    @ParameterizedTest
    @CsvSource({
        "'-3, 1, 2, -2, 5, 6', 60",
        "'-3, -1, -2, 0', 0"
    })
    void test(@ConvertWith(IntegerArrayConverter.class) int[] A, int answer) {
        int result = new MaxProductOfThree().solution(A);
        assertEquals(answer, result);
    }
}
