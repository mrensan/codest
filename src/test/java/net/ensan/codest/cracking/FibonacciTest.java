package net.ensan.codest.cracking;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {

    private final Fibonacci fibonacci = new Fibonacci();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5",
            "6, 8",
            "7, 13",
            "8, 21",
    })
    void fibonacci(int value, long expected) {
        assertThat(fibonacci.fibonacciBottomUp(value)).isEqualTo(expected);
    }
}