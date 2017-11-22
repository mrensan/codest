package net.ensan.codest.despat.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class LazyInitializedSingletonTest {
    @Test
    public void getInstance() throws Exception {
        LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
        assertEquals(instance1, instance2);
        assertSame(instance1, instance2);
    }
}