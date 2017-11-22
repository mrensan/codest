package net.ensan.codest.despat.singleton;

import net.ensan.codest.despat.singleton.EagerInitializedSingleton;
import org.junit.Test;

import static org.junit.Assert.*;

public class EagerInitializedSingletonTest {
    @Test
    public void getInstance() throws Exception {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
        assertEquals(instance1, instance2);
        assertSame(instance1, instance2);
    }
}