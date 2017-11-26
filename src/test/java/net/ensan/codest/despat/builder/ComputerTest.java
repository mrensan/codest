package net.ensan.codest.despat.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    @Test
    public void builderPatternTest() {
        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true).build();

        assertEquals(Computer.class, computer.getClass());
        assertEquals("500 GB", computer.getHDD());
        assertEquals("2 GB", computer.getRAM());
        assertEquals(true, computer.isBluetoothEnabled());
        assertEquals(true, computer.isGraphicsCardEnabled());
    }
}