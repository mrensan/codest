package net.ensan.codest.despat.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

public class BridgePatternTest {
    @Test
    public void bridgePatternTest() throws Exception {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();
        tri = new Triangle(new GreenColor());
        tri.applyColor();

        Shape pent = new Pentagon(new RedColor());
        pent.applyColor();
        pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}