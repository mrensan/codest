package net.ensan.codest.codility;

import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PermCheckTest {

    @ParameterizedTest
    @CsvSource({
            "1, '4, 1, 3, 2'",
            "0, '4, 1, 3'",
            "0, '3, 5, 6'"
    })
    void testPermCheck(int result, @ConvertWith(IntegerArrayConverter.class) int[] A) {
        assertThat(new PermCheck().solution(A)).isEqualTo(result);
    }
}
