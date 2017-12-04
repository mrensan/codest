package net.ensan.codest.despat.chainresponsibility;

/**
 * <p>Chain of responsibility pattern is used to achieve lose coupling in
 * software design where a request from client is passed to a chain of objects
 * to process them. Then the object in the chain will decide themselves who will
 * be processing the request and whether the request is required to be sent to
 * the next object in the chain or not.
 *
 * <ul>
 *     <li>
 *         Client doesn’t know which part of the chain will be processing the request
 *         and it will send the request to the first object in the chain. For example,
 *         in our program ATMDispenseChain is unaware of who is processing the request
 *         to dispense the entered amount.
 *     </li>
 *     <li>
 *         Each object in the chain will have its own implementation to process the request,
 *         either full or partial or to send it to the next object in the chain.
 *     </li>
 *     <li>
 *         Every object in the chain should have reference to the next object in chain to
 *         forward the request to, it’s achieved by java composition.
 *     </li>
 *     <li>
 *         Creating the chain carefully is very important otherwise there might be a case
 *         that the request will never be forwarded to a particular processor or there are
 *         no objects in the chain who are able to handle the request. In my implementation,
 *         I have added the check for the user entered amount to make sure it gets processed
 *         fully by all the processors but we might not check it and throw exception if the
 *         request reaches the last object and there are no further objects in the chain to
 *         forward the request to. This is a design decision.
 *     </li>
 *     <li>
 *         Chain of Responsibility pattern is good to achieve lose coupling but it comes with
 *         the trade-off of having a lot of implementation classes and maintenance problems
 *         if most of the code is common in all the implementations.
 *     </li>
 * </ul>
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class ATMDispenseChain {

    private DispenseChain c1;

    public ATMDispenseChain() {
        // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        c1.setNextDispense(c2);
        c2.setNextDispense(c3);
    }

    public void startDispense(int amount) {
        if (amount % 10 != 0 || amount == 0) {
            throw new RuntimeException("Amount should be in multiple of 10s.");
        }
        this.c1.dispense(new Currency(amount));
    }
}
