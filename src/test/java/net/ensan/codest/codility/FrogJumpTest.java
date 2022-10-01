package net.ensan.codest.codility;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FrogJumpTest {

    @ParameterizedTest
    @CsvSource({
            "10, 85, 30, 3",
            "10, 56, 5, 10"
    })
    void testFrogJump(int X, int Y, int D, int result) {
        assertThat(new FrogJump().solution(X, Y, D)).isEqualTo(result);
    }
}
