package net.ensan.codest.despat.flyweight;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeFactoryTest {
    @Test
    public void flyweightTest() throws Exception {
        Shape line1 = ShapeFactory.getShape(ShapeFactory.ShapeType.LINE);
        assertNotNull(line1);
        Shape line2 = ShapeFactory.getShape(ShapeFactory.ShapeType.LINE);
        assertNotNull(line2);
        assertSame(line1, line2);

        Shape ovalFilled1 = ShapeFactory.getShape(ShapeFactory.ShapeType.OVAL_FILL);
        assertNotNull(ovalFilled1);
        Shape ovalFilled2 = ShapeFactory.getShape(ShapeFactory.ShapeType.OVAL_FILL);
        assertNotNull(ovalFilled2);
        assertSame(ovalFilled1, ovalFilled2);

        Shape ovalNotFilled1 = ShapeFactory.getShape(ShapeFactory.ShapeType.OVAL_NOFILL);
        assertNotNull(ovalNotFilled1);
        Shape ovalNotFilled2 = ShapeFactory.getShape(ShapeFactory.ShapeType.OVAL_NOFILL);
        assertNotNull(ovalNotFilled2);
        assertSame(ovalNotFilled1, ovalNotFilled2);
    }
}