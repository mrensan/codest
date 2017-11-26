package net.ensan.codest.despat.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerFactoryTest {
    @Test
    public void getComputer() throws Exception {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer pc2 = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        assertEquals(PC.class, pc.getClass());
        assertEquals(Server.class, server.getClass());
        assertNotSame(pc, pc2); // not singleton

        assertEquals("2 GB", pc.getRAM());
        assertEquals("500 GB", pc.getHDD());
        assertEquals("2.4 GHz", pc.getCPU());
        assertEquals("16 GB", server.getRAM());
        assertEquals("1 TB", server.getHDD());
        assertEquals("2.9 GHz", server.getCPU());
    }

}