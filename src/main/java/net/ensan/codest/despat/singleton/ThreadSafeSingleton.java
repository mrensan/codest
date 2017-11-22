package net.ensan.codest.despat.singleton;


/**
 * Two different implementation of thread safe singleton.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    /**
     * The easier way to create a thread-safe singleton class is
     * to make the global access method synchronized, so that only
     * one thread can execute this method at a time.
     *
     * @return the instance of singleton class.
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * We need synchronization only for the first few threads who might create
     * the separate instances. To avoid this extra overhead every time, double
     * checked locking principle is used. In this approach, the synchronized
     * block is used inside if condition with an additional check to ensure that
     * only one instance of singleton class is created.
     *
     * @return the instance of singleton class.
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
