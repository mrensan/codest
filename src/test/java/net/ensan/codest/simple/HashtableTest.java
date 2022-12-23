package net.ensan.codest.simple;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class HashtableTest {

    public static final String KEY_1 = "ARBITRARY_KEY_1";
    public static final String VALUE_1 = "ARBITRARY_VALUE_1";

    public static final String KEY_2 = "ARBITRARY_KEY_2";
    public static final String VALUE_2 = "ARBITRARY_VALUE_2";

    public static final String KEY_3 = "ARBITRARY_KEY_3";
    public static final String VALUE_3 = "ARBITRARY_VALUE_3";

    @Test
    void putSomeKeyValues_GetKeys_ExpectSameValues() {
        Hashtable<String, String> myHashtable = new Hashtable<>();
        myHashtable.put(KEY_1, VALUE_1);
        myHashtable.put(KEY_2, VALUE_2);
        myHashtable.put(KEY_3, VALUE_3);

        assertThat(myHashtable.get(KEY_1)).isNotNull().isEqualTo(VALUE_1);
        assertThat(myHashtable.get(KEY_2)).isNotNull().isEqualTo(VALUE_2);
        assertThat(myHashtable.get(KEY_3)).isNotNull().isEqualTo(VALUE_3);
        assertThat(myHashtable.size()).isEqualTo(3);
        assertThat(myHashtable.isEmpty()).isFalse();
    }
}