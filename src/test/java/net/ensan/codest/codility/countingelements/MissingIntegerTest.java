package net.ensan.codest.codility.countingelements;

import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MissingIntegerTest {

    private final MissingInteger missingInteger = new MissingInteger();

    @ParameterizedTest
    @CsvSource({
            "5, '1, 3, 6, 4, 1, 2'",
            "4, '1, 2, 3'",
            "1, '-1, -3'"
    })
    void testMissingInteger(int result, @ConvertWith(IntegerArrayConverter.class) int[] A) {
        assertThat(missingInteger.solution(A)).isEqualTo(result);
    }
}
