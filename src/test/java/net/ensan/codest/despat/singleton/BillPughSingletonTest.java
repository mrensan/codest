package net.ensan.codest.despat.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class BillPughSingletonTest {
    @Test
    public void getInstance() throws Exception {
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        BillPughSingleton instance2 = BillPughSingleton.getInstance();

        assertEquals(instance1, instance2);
        assertSame(instance1, instance2);
    }

}