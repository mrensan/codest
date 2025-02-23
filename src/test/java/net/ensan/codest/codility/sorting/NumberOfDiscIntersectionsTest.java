package net.ensan.codest.codility.sorting;

import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDiscIntersectionsTest {

    @ParameterizedTest
    @CsvSource({
        "'1, 5, 2, 1, 4, 0', 11",
        "'0', 0",
        "'1', 0"
    })
    void test(@ConvertWith(IntegerArrayConverter.class) int[] A, int answer) {
        int result = new NumberOfDiscIntersections().solution(A);
        assertEquals(answer, result);
    }

}
