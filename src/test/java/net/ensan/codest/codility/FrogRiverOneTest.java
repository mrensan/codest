package net.ensan.codest.codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FrogRiverOneTest {

    private final FrogRiverOne frogRiverOne = new FrogRiverOne();

    private static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}, 6),
            Arguments.of(4, new int[] {1, 3, 1, 4, 2, 4, 1}, 4),
            Arguments.of(6, new int[] {1, 3, 1, 4, 2, 4, 1, 5, 3}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void calculateFrogRiver(int X, int[] A, int answer) {
        assertThat(frogRiverOne.solution(X, A)).isEqualTo(answer);
    }
}
