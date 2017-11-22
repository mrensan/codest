package net.ensan.codest.despat.singleton;

/**
 * In eager initialization, the instance of Singleton Class is
 * created at the time of class loading, this is the easiest
 * method to create a singleton class but it has a drawback
 * that instance is created even though client application
 * might not be using it.
 *
 * @author Shahram via (Book: Java Design Patterns by Pankaj Kumar)
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
