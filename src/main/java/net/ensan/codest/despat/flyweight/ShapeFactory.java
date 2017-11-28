package net.ensan.codest.despat.flyweight;

import java.util.HashMap;

/**
 * <p>Flyweight design pattern intent is using sharing to support
 * large numbers of fine-grained objects efficiently. Flyweight
 * design pattern is used when we need to create a lot of Objects
 * of a class. Since every object consumes memory space that can
 * be crucial for low memory devices, such as mobile devices or
 * embedded systems, flyweight design pattern can be applied to
 * reduce the load on memory by sharing objects.
 *
 * <p>Before we apply flyweight design pattern, we need to consider
 * following factors:
 *
 * <ul>
 *     <li>The number of Objects to be created by application should be huge.</li>
 *     <li>The object creation is heavy on memory and it can be time consuming too.</li>
 *     <li>The object properties can be divided into intrinsic and extrinsic properties,
 *     extrinsic properties of an Object should be defined by the client program.</li>
 * </ul>
 *
 */
public class ShapeFactory {

    private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);
        if (shapeImpl == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval(true);
            } else if (type.equals(ShapeType.OVAL_NOFILL)) {
                shapeImpl = new Oval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }

    public static enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE;
    }
}
