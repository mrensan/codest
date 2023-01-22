package net.ensan.codest.hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class AppendAndDeleteTest {

    private final AppendAndDelete appendAndDelete = new AppendAndDelete();

    @ParameterizedTest
    @CsvSource({
            "abc, def, 6, true",
            "hackerhappy, hackerrank, 9, true",
            "aba, aba, 7, true",
            "ashley, ash, 2, false",
            "abcd, abcdert, 10, false"
    })
    void appendAndDeleteShouldReturnExpectedResult(String s, String t, int k, boolean expected) {
        assertThat(appendAndDelete.appendAndDelete(s, t, k)).isEqualTo(expected);
    }
}