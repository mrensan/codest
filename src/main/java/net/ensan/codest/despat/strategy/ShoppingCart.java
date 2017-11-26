package net.ensan.codest.despat.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Strategy pattern is used when we have multiple algorithm for
 * a specific task and client decides the actual implementation
 * to be used at runtime.
 *
 * <p>Strategy pattern is also known as Policy Pattern. We defines
 * multiple algorithms and let client application pass the algorithm
 * to be used as a parameter.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class ShoppingCart {
    //List of items
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
