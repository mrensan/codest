package net.ensan.codest.despat.composite;

/**
 * The {@code Leaf } object of Composite.
 *
 */
public class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color "+fillColor);
    }
}
