package net.ensan.codest.despat.iterator;

/**
 * <p>Iterator Pattern is used to provide a standard way to traverse
 * through a group of Objects. Provides a way to access the elements
 * of an aggregate object without exposing its underlying representation.
 *
 * <ul>
 *     <li>Iterator pattern is useful when you want to provide a standard
 *     way to iterate over a collection and hide the implementation logic
 *     from client program.</li>
 *     <li>The logic for iteration is embedded in the collection itself and
 *     it helps client program to iterate over them easily.</li>
 * </ul>
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public interface ChannelIterator {

    public boolean hasNext();

    public Channel next();
}
