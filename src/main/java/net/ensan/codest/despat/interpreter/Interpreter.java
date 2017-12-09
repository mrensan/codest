package net.ensan.codest.despat.interpreter;

public class Interpreter {

    public InterpreterContext ic;

    public Interpreter(InterpreterContext ic) {
        this.ic = ic;
    }

    public String interpret(String str) {
        Expression exp = null;

        // Create rules for expressions
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else {
            return str;
        }
        return exp.interpret(ic);
    }
}
