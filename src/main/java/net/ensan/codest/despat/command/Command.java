package net.ensan.codest.despat.command;

/**
 * <p>Commmand Pattern is used to implement lose coupling in a request-response model.
 *
 * <p>In command pattern, the request is send to the invoker and invoker pass it to
 * the encapsulated command object. Command object passes the request to the appropriate
 * method of Receiver to perform the specific action.
 *
 * <p>The client program create the receiver object and then attach it to the Command.
 * Then it creates the invoker object and attach the command object to perform an action.
 * Now when client program executes the action, it’s processed based on the command and
 * receiver object.
 *
 * <ul>
 *     <li>Command is the core of this pattern that defines the contract for implementation.</li>
 *     <li>Receiver implementation is separate from command implementation.</li>
 *     <li>Command implementation classes chose the method to invoke on receiver object, for
 *     every method in receiver there will be a command implementation. It works as a bridge
 *     between receiver and action methods.</li>
 *     <li>Invoker class just forward the request from client to the command object.</li>
 *     <li>Client is responsible to instantiate appropriate command and receiver implementation
 *     and then associate them together.</li>
 *     <li>Client is also responsible for instantiating invoker object and associating command object
 *     with it and execute the action method.</li>
 *     <li>Command pattern is easily extensible, we can add new action methods in receivers and create
 *     new Command implementations without changing the client code.</li>
 *     <li>The drawback with Command pattern is that the code gets huge and confusing with high number
 *     of action methods and because of so many associations.</li>
 * </ul>
 */
public interface Command {

    void execute();
}
