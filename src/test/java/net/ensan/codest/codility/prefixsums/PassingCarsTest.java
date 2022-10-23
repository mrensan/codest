package net.ensan.codest.codility.prefixsums;

import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PassingCarsTest {

    final private PassingCars passingCars = new PassingCars();

    @ParameterizedTest
    @CsvSource({
            "'0, 1, 0, 1, 1', 5",
            "'1, 1, 0, 1, 1', 2",
            "'0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1', 21"
    })
    void testPassingCars(@ConvertWith(IntegerArrayConverter.class) int[] A, int answer) {
        assertThat(passingCars.solution(A)).isEqualTo(answer);
    }
}
