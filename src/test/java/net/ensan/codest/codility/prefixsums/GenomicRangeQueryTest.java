package net.ensan.codest.codility.prefixsums;

import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class GenomicRangeQueryTest {

    private final GenomicRangeQuery query = new GenomicRangeQuery();

    @ParameterizedTest
    @CsvSource({
            "CAGCCTA, '2, 5, 0', '4, 5 , 6', '2, 4, 1'"
    })
    void testGenomicRangeQuery(
            String S,
            @ConvertWith(IntegerArrayConverter.class) int[] P,
            @ConvertWith(IntegerArrayConverter.class) int[] Q,
            @ConvertWith(IntegerArrayConverter.class) int[] result
    ) {
        assertThat(query.solution(S, P, Q)).isEqualTo(result);
    }
}
