package net.ensan.codest.despat.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {
    @Test
    public void strategyPatternTest() throws Exception {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));

        // how should write test clauses!
        assertTrue(true);
    }

}