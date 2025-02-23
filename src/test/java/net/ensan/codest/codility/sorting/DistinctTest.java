package net.ensan.codest.codility.sorting;

import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistinctTest {
    @ParameterizedTest
    @CsvSource({
        "'2, 1, 1, 2, 3, 1', 3",
        "',', 0",
        "'1', 1"
    })
    void test(@ConvertWith(IntegerArrayConverter.class) int[] A, int answer) {
        int result = new Distinct().solution(A);
        assertEquals(answer, result);
    }
}
