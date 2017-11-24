package net.ensan.codest.despat.singleton;

/**
 * To overcome breaking the singleton rule by reflection,
 * we can use enum implementation of singleton.
 *
 */
public enum EnumSingleton {

    INSTANCE;

    public static void doSomething() {
        // do something...
    }
}
