package net.ensan.codest.codility.stacksqueues;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BracketsTest {
    @ParameterizedTest
    @CsvSource({
        "'', 1",
        "'{', 0",
        "'{}', 1",
        "']]', 0",
        "'{[()()]}', 1",
        "'{[()(())', 0", // important deception! The case which needs last empty checking
        "'([)()]', 0",
    })
    void test(String S, int answer) {
        int result = new Brackets().solution(S);
        assertEquals(answer, result);
    }
}
