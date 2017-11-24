package net.ensan.codest.despat.singleton;

import net.ensan.codest.despat.singleton.EagerInitializedSingleton;
import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.*;

public class EagerInitializedSingletonTest {
    @Test
    public void getInstance() throws Exception {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
        assertEquals(instance1, instance2);
        assertSame(instance1, instance2);
    }

    /**
     * This test shows how can break a singleton pattern
     * by using the reflection. To overcome this problem,
     * use {@link EnumSingleton} implementation.
     */
    @Test
    public void reflectionSingletonTest() {
        EagerInitializedSingleton instanceOne =
                EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton)constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

        assertNotSame(instanceOne, instanceTwo);
    }
}