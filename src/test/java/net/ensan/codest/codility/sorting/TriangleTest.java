package net.ensan.codest.codility.sorting;

import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @ParameterizedTest
    @CsvSource({
        "'10, 2, 5, 1, 8, 20', 1",
        "'10, 50, 5, 1', 0",
    })
    void test(@ConvertWith(IntegerArrayConverter.class) int[] A, int answer) {
        int result = new Triangle().solution(A);
        assertEquals(answer, result);
    }
}
