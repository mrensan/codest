package net.ensan.codest.codility;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class HelloFrTest {

    @Test
    void testCalculateCashier() {
        HelloFr helloFr = new HelloFr();

        boolean result = helloFr.calculateCashier(new int[] {5, 10, 5, 5, 5, 20, 10});
        Assertions.assertThat(result).isTrue();
    }
}
