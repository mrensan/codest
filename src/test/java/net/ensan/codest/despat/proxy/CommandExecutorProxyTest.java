package net.ensan.codest.despat.proxy;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CommandExecutorProxyTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void proxyPatternWithExceptionTest() throws Exception {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj","wrong_pwd");

        executor.runCommand(" ls  abc.pdf");

        thrown.expect(Exception.class);
        thrown.expectMessage("rm command is not allowed for non-admin users.");
        executor.runCommand(" rm  abc.pdf");
    }

    @Test
    public void proxyPatternWithoutExceptionTest() throws Exception {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "J@urnalD$v");

        executor.runCommand(" ls abc.pdf");
        executor.runCommand(" rm abc.pdf");

        // no exception expected, none thrown: passes.
    }

}