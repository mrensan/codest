package net.ensan.codest.codility;

import net.ensan.codest.utils.IntegerArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FrogRiverOneTest {
    private final FrogRiverOne frogRiverOne = new FrogRiverOne();

    @ParameterizedTest
    @CsvSource({
            "5, 6, '1, 3, 1, 4, 2, 3, 5, 4'",
            "4, 4, '1, 3, 1, 4, 2, 4, 1'",
            "6, -1, '1, 3, 1, 4, 2, 4, 1, 5, 3'"
    })
    void calculateFrogRiver(int X, int answer, @ConvertWith(IntegerArrayConverter.class) int[] A) {
        assertThat(frogRiverOne.solution(X, A)).isEqualTo(answer);
    }
}
