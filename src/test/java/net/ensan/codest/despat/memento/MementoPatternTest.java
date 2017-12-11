package net.ensan.codest.despat.memento;

import org.junit.Test;

import static org.junit.Assert.*;

public class MementoPatternTest {
    @Test
    public void mementoTest() throws Exception {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First set of data\n");
        System.out.println(fileWriter + "\n\n");

        // let's save the file
        caretaker.save(fileWriter);
        // now write something else
        fileWriter.write("Second set of data\n");

        // checking file contents
        System.out.println(fileWriter + "\n\n");

        // let undo the last save
        caretaker.undo(fileWriter);

        // checking file content again
        System.out.println(fileWriter + "\n\n");
    }

}