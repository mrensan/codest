package net.ensan.codest.despat.singleton;

import org.junit.Test;
import org.junit.experimental.theories.Theories;

import static org.junit.Assert.*;

public class ThreadSafeSingletonTest {
    @Test
    public void getInstance() throws Exception {
        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();

        assertEquals(instance1, instance2);
        assertSame(instance1, instance2);
    }

    @Test
    public void getInstanceUsingDoubleLocking() throws Exception {
        ThreadSafeSingleton instance3 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        ThreadSafeSingleton instance4 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();

        assertEquals(instance3, instance4);
        assertSame(instance3, instance4);
    }
}