package net.ensan.codest.interview;

import net.ensan.codest.utils.StringArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MakeWordsEqualTest {

    @ParameterizedTest
    @CsvSource({
        "'aaka, aaka, aaja, aaxa, aaba', 'aaaa'",
        "'bay, zaz, bab', 'baz'",
        "'aya, aba, abb, zba', 'aba'",
        "'zzz, bcb, zzc', ''"
    })
    void testSolution50Percent(@ConvertWith(StringArrayConverter.class) String[] s, String answer) {
        String result = new MakeWordsEqual().solution50Percent(s);
        assertEquals(answer, result);
    }

    @ParameterizedTest
    @CsvSource({
        "'aaka, aaka, aaja, aaxa, aaba', 'aaka'",
        "'bay, zaz, bab', 'baz'",
        "'aya, aba, abb, zba', 'aba'",
        "'zzz, bcb, zzc', ''"
    })
    void testSolution(@ConvertWith(StringArrayConverter.class) String[] s, String answer) {
        String result = new MakeWordsEqual().solution(s);
        assertEquals(answer, result);
    }
}
