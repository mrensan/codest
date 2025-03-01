package net.ensan.codest.codility.stacksqueues;

import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FishTest {

    @ParameterizedTest
    @CsvSource({
        "'4, 3, 2, 1, 5', '0, 1, 0, 0, 0', 2",
        "',', ',', 0",
        "'3,', '1,', 1"
    })
    void test(
        @ConvertWith(IntegerArrayConverter.class) int[] A,
        @ConvertWith(IntegerArrayConverter.class) int[] B,
        int answer
    ) {
        int result = new Fish().solution(A, B);
        assertEquals(answer, result);
    }
}
