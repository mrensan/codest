package net.ensan.codest.codility.countingelements;


import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MaxCountersTest {

    private MaxCounters maxCounters = new MaxCounters();

    @ParameterizedTest
    @CsvSource({
            "5, '3, 4, 4, 6, 1, 4, 4', '3, 2, 2, 4, 2'"
    })
    void testMaxCounters(
            int N,
            @ConvertWith(IntegerArrayConverter.class) int[] A,
            @ConvertWith(IntegerArrayConverter.class) int[] result
    ) {
        assertThat(maxCounters.solution(N, A)).isEqualTo(result);
    }
}
