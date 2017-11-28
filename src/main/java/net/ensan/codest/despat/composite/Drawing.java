package net.ensan.codest.despat.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Composite Pattern is used when we have to represent a part-whole hierarchy.
 * When we need to create a structure in a way that the objects in the structure
 * has to be treated the same way.
 *
 * <p> Composite Pattern consists of following objects:
 * <ul>
 *     <li><strong>Base Component</strong> – Base component is the interface for
 *     all objects in the composition, client program uses base component to work
 *     with the objects in the composition. It can be an interface or an abstract
 *     class with some methods common to all the objects.</li>
 *     <li><strong>Leaf</strong> – Defines the behaviour for the elements in the
 *     composition. It is the building block for the composition and implements
 *     base component. It doesn’t have references to other Components.</li>
 *     <li><strong>Composite</strong> – It consists of leaf elements and implements
 *     the operations in base component.</li>
 * </ul>
 *
 * <p>The {@code composite} object of the Composite Design Pattern. A composite object
 * contains group of leaf objects and we should provide some helper methods to add or
 * delete leafs from the group. We can also provide a method to remove all the elements
 * from the group.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class Drawing implements Shape {

    // collection of Shapes
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw(String fillColor) {
        for (Shape shape: shapes) {
            shape.draw(fillColor);
        }
    }

    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    public void remove(Shape shape) {
        this.shapes.remove(shape);
    }

    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}
