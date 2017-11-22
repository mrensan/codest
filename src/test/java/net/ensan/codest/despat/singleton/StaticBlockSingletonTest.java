package net.ensan.codest.despat.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaticBlockSingletonTest {
    @Test
    public void getInstance() throws Exception {
        StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
        assertEquals(instance1, instance2);
        assertSame(instance1, instance2);
    }
}