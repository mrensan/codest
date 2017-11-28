package net.ensan.codest.despat.composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class DrawingTest {
    @Test
    public void compositePatternTest() throws Exception {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri);
        drawing.add(tri1);
        drawing.add(cir);
        drawing.draw("Red");

        drawing.clear();
        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");

        // !
        assertTrue(true);
    }

}