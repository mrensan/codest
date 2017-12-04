package net.ensan.codest.despat.chainresponsibility;

public interface DispenseChain {

    void setNextDispense(DispenseChain nextChain);

    void dispense(Currency currency);
}
