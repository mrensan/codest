package net.ensan.codest.despat.singleton;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class SerializedSingletonTest {
    @Test
    public void getInstance() throws Exception {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream( "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream( "filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

        assertSame(instanceOne, instanceTwo);
    }

}