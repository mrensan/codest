package net.ensan.codest.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoneWallTest {
    @Test
    public void calculateStoneWall() throws Exception {
        StoneWall stoneWall = new StoneWall();
        assertEquals(0, stoneWall.calculateStoneWall(new int[] {}));
        assertEquals(2, stoneWall.calculateStoneWall(new int[] {8,8,8,8,8,9,9,9,8}));
        assertEquals(3, stoneWall.calculateStoneWall(new int[] {8,8,8,8,8,7,7,7,8}));
        assertEquals(1, stoneWall.calculateStoneWall(new int[] {8,8,8,8,8,8}));
        assertEquals(7, stoneWall.calculateStoneWall(new int[] {8,8,5,7,9,8,7,4,8}));
    }

}