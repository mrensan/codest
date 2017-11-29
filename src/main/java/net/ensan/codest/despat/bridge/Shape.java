package net.ensan.codest.despat.bridge;

/**
 * <p>When we have interface hierarchies in both interfaces as well
 * as implementations, then bridge design pattern is used to decouple
 * the interfaces from implementation and hiding the implementation
 * details from the client programs.
 *
 * <p>Notice the bridge between the abstract class and the interface
 * and use of composition in implementing the bridge pattern.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public abstract class Shape {

    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
