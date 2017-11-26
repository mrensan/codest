package net.ensan.codest.despat.abstractfactory;

import net.ensan.codest.despat.factory.Computer;

/**
 * <p>Abstract Factory is one of the Creational pattern and almost similar to
 * Factory Pattern except the fact that it’s more like factory of factories.
 *
 * <p>In Abstract Factory pattern, we get rid of if-else block and have a
 * factory class for each sub-class and then an Abstract Factory class that
 * will return the sub-class based on the input factory class.
 *
 * <p>Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
