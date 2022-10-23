package net.ensan.codest.codility.prefixsums;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CountDivTest {

    private final CountDiv countDiv = new CountDiv();

    @ParameterizedTest
    @CsvSource({
            "6, 11, 2, 3",
            "5, 11, 2, 3",
            "5, 10, 2, 3",
            "5, 10, 3, 2",
            "5, 5, 3, 0",
            "6, 6, 3, 1",
            "3, 5, 1, 3",
            "0, 0, 1, 1",
    })
    void testCountDiv(int A, int B, int K, int answer) {
        assertThat(countDiv.solution(A, B, K)).isEqualTo(answer);
    }
}
