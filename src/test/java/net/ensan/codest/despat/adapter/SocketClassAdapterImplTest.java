package net.ensan.codest.despat.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class SocketClassAdapterImplTest {

    SocketAdapter adapter = new SocketClassAdapterImpl();

    @Test
    public void get120Volt() throws Exception {
        assertEquals(120, adapter.get120Volt().getVolts());
    }

    @Test
    public void get12Volt() throws Exception {
        assertEquals(12, adapter.get12Volt().getVolts());
    }

    @Test
    public void get3Volt() throws Exception {
        assertEquals(3, adapter.get3Volt().getVolts());
    }

}