package net.ensan.codest.despat.interpreter;

import org.junit.Test;

import static org.junit.Assert.*;

public class InterpreterPatternTest {
    @Test
    public void interpreterTest() throws Exception {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Interpreter interpreter = new Interpreter(new InterpreterContext());
        System.out.println(str1+"= " + interpreter.interpret(str1));
        System.out.println(str2+"= " + interpreter.interpret(str2));
    }

}