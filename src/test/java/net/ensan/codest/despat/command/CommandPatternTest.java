package net.ensan.codest.despat.command;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandPatternTest {
    @Test
    public void commandPatternTest() throws Exception {
        // Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // Creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        // Creating invoker and associating with command
        FileInvoker file = new FileInvoker(openFileCommand);

        // Perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }

}