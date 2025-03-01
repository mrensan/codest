package net.ensan.codest.codility.stacksqueues;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NestingTest {
    @ParameterizedTest
    @CsvSource({
        "'', 1",
        "'(', 0",
        "'()', 1",
        "'))', 0",
        "'((()()))', 1",
        "'((()(())', 0", // important deception! The case which needs last empty checking
        "'(()())', 1",
    })
    void test(String S, int answer) {
        int result = new Nesting().solution(S);
        assertEquals(answer, result);
    }

}
