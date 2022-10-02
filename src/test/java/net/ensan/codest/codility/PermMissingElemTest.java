package net.ensan.codest.codility;


import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PermMissingElemTest {

    @ParameterizedTest
    @CsvSource({
            "3, '4, 1, 2'",
            "4, '2, 3, 1, 5'",
            "6, '8, 1, 4, 5, 3, 2, 7, 9'",
            "1, '2'"
    })
    void testPermMissingElem(int result, @ConvertWith(IntegerArrayConverter.class) int[] A) {
        assertThat(new PermMissingElem().solution(A)).isEqualTo(result);
    }

    @Test
    void testPermMissingElemEmptyArray() {
        assertThat(new PermMissingElem().solution(new int[0])).isEqualTo(1);
    }
}
