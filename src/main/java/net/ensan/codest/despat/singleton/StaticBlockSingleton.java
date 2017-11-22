package net.ensan.codest.despat.singleton;

/**
 * Static block initialization implementation is similar to eager initialization,
 * except that instance of class is created in the static block that provides option
 * for exception handling.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance", e);
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
