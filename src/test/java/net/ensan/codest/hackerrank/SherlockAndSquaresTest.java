package net.ensan.codest.hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SherlockAndSquaresTest {

    private final SherlockAndSquares squares = new SherlockAndSquares();

    @ParameterizedTest
    @CsvSource({
            "24, 49, 3",
            "3, 9, 2",
            "17, 24, 0",
            "35, 70, 3",
            "100, 1000, 22"
    })
    void squaresShouldReturnCorrectResult(int a, int b, int expected) {
        assertThat(squares.squares(a, b)).isEqualTo(expected);
    }
}