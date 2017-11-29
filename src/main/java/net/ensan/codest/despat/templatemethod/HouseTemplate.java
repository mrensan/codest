package net.ensan.codest.despat.templatemethod;

/**
 * <p>{@code Template Method} is to create a method stub and deferring some
 * of the steps of implementation to the subclasses. Template method defines
 * the steps to execute an algorithm and it can provide default implementation
 * that might be common for all or some of the subclasses.
 *
 * <ul>
 *     <li>Template method should consists of certain steps whose order is fixed
 *     and for some of the methods, implementation differs from base class to subclass.
 *     Template method should be final.</li>
 *     <li>Most of the times, subclasses calls methods from super class but in template
 *     pattern, superclass template method calls methods from subclasses</li>
 *     <li>Methods in base class with default implementation are referred as Hooks and
 *     they are intended to be overridden by subclasses, if you want some of the methods
 *     to be not overridden, you can make them final, for example in our case we can make
 *     buildFoundation() method final because if we don’t want subclasses to override it.</li>
 * </ul>
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public abstract class HouseTemplate {

    //template method, final so subclasses can't override
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    //default implementation
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    //methods to be implemented by subclasses
    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }
}
