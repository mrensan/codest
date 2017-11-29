package net.ensan.codest.despat.mediator;

/**
 * <p>Mediator design pattern is used to provide a centralized
 * communication medium between different objects in a system.
 *
 * <p>Allows loose coupling by encapsulating the way disparate
 * sets of objects interact and communicate with each other.
 * Allows for the actions of each object set to vary independently
 * of one another
 *
 * <ul>
 *     <li>Mediator pattern is useful when the communication logic between
 *     objects is complex, we can have a central point of communication that
 *     takes care of communication logic.</li>
 *     <li>Java Message Service (JMS) uses Mediator pattern along with Observer
 *     pattern to allow applications to subscribe and publish data to other
 *     applications.</li>
 *     <li>We should not use mediator pattern just to achieve lose-coupling
 *     because if the number of mediators will grow, then it will become hard
 *     to maintain them.</li>
 * </ul>
 * {@code Mediator Interface}
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
