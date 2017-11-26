package net.ensan.codest.despat.factory;

/**
 * Factory design pattern is used when we have a super class with multiple
 * sub-classes and based on input, we need to return one of the sub-class.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram,
                                       String  hdd, String cpu ){
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}
