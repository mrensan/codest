package net.ensan.codest.codility;

import org.junit.Test;
import static org.junit.Assert.*;

public class FishTest {
    @Test
    public void calculateFish() throws Exception {
        Fish fish = new Fish();
        assertEquals(0, fish.calculateFish(new int[] {}, new int[]{}));
        assertEquals(1, fish.calculateFish(new int[] {3}, new int[]{1}));
        assertEquals(1, fish.calculateFish(new int[] {3}, new int[]{0}));
        assertEquals(2, fish.calculateFish(new int[] {4,3,2,1,5}, new int[]{0,1,0,0,0}));
    }

}