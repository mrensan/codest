package net.ensan.codest.despat.adapter;

/**
 * The Adapter is used so that two unrelated interfaces can work together.
 * The object that joins these unrelated interface is called an Adapter.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
