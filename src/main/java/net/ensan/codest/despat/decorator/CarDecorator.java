package net.ensan.codest.despat.decorator;

/**
 * <p>{@code Decorator} class implements the component interface and
 * it has a relationship with the component interface.
 *
 * <p>Decorator design pattern is used to modify the functionality of
 * an object at runtime. At the same time other instances of the same
 * class will not be affected by this, so individual object gets the
 * modified behavior.
 *
 * <ul>
 *     <li>Decorator pattern is helpful in providing runtime modification
 *     abilities and hence more flexible. It’s easy to maintain and extend
 *     when the number of choices are more.</li>
 *     <li>The disadvantage of decorator pattern is that it uses a lot of
 *     similar kind of objects (decorators).</li>
 *     <li>Decorator pattern is used a lot in Java IO classes, such as FileReader,
 *     BufferedReader etc.</li>
 * </ul>
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
