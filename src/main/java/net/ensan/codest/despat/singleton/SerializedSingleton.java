package net.ensan.codest.despat.singleton;

import java.io.Serializable;

/**
 * Sometimes in distributed systems, we need to implement Serializable
 * interface in Singleton class so that we can store its state in file
 * system and retrieve it at later point of time.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    /**
     * This method is very important to make sure
     * the same instance of class that is serialized
     * will be instantiated again.
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }
}
