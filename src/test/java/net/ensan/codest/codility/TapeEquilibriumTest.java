package net.ensan.codest.codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TapeEquilibriumTest {

    private final TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    private static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of(new int[] {3,1,2,4,3}, 1),
            Arguments.of(new int[] {7,1,2,4,11,3,5}, 5),
            Arguments.of(new int[] {1000, -3000}, 4000),
            Arguments.of(new int[] {1, -1, 0}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void calculateTapeEquilibrium(int[] A, int answer) {
        assertThat(tapeEquilibrium.solution(A))
            .isEqualTo(answer);
    }
}
