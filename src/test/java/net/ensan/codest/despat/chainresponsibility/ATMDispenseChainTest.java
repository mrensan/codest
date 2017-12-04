package net.ensan.codest.despat.chainresponsibility;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ATMDispenseChainTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void chainOfResponsibilityTest() {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        atmDispenser.startDispense(30);
        atmDispenser.startDispense(100);
        atmDispenser.startDispense(110);

        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Amount should be in multiple of 10s.");

        atmDispenser.startDispense(45);
        atmDispenser.startDispense(15);
        atmDispenser.startDispense(0);
    }
}