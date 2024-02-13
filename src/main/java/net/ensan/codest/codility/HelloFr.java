package net.ensan.codest.codility;

import java.util.HashMap;
import java.util.Map;

/*
Money Change

John is a strawberry merchant, selling strawberries at a price of €5 for 1 kilogram.

Each customer can only buy 1 Kg of strawberries, but can pay with €5, €10 or €20 bills.
When a customer is paying with a bill of more than €5, John needs to return correct change.

Given an array of customers represented with the bills with which they are paying,
your function should return *true* if John can serve each customer in the queue (either the
customer is paying the exact price or John will need to return the correct change), or *false* otherwise.

**Example 1:**
The input array is: [5, 10, 5, 20]; should return *true* because:
- First customer pays with €5 bill, gets no change
- Second customer pays with €10 bill, gets €5 change
- Third customer pays with €5 bill, gets no change
- Fourth customer pays with €20 bill, gets €15 change (€10 + €5 bills)

**Example 2:**
The input array is: [5, 20, 5, 20]; should return *false* because:
- First customer pays with €5 bill, gets no change
- Second customer pays with €20 bill, should get €15 change, but John only has one €5 bill.
- At this point John cannot return the change and our function should return false.
 */
public class HelloFr {

    public boolean calculateCashier(int[] billsOfFive) {
        // parse a csv of file column

        Map<Integer, Integer> cashier = new HashMap<>();
        cashier.put(5, 0);
        cashier.put(10, 0);
        cashier.put(20, 0);

        for(int bill: billsOfFive) {
            if (bill == 5) {
                cashier.put(5, cashier.get(5) + 1);
            } else if (bill == 10) {
                if (cashier.get(5) == 0) {
                    return false;
                }
                cashier.put(5, cashier.get(5) - 1);
                cashier.put(10, cashier.get(10) + 1);
            } else {
                if (cashier.get(5) == 0) {
                    return false;
                }
                if (cashier.get(10) == 0) {
                    if (cashier.get(5) < 3) {
                        return false;
                    } else {
                        // 5, 5, 5
                        cashier.put(5, cashier.get(5) - 3);
                    }
                } else {
                    if (cashier.get(5) < 1 ) {
                        return false;
                    } else {
                        cashier.put(5, cashier.get(5) - 1);
                        cashier.put(10, cashier.get(10) + 1);
                    }
                }
            }
        }
        return true;
    }
}
