package net.ensan.codest.despat.interpreter;

/**
 * <p>Interpreter Pattern is used to define a grammatical representation
 * for a language and provides an interpreter to deal with this grammar.
 *
 * <p>To implement interpreter pattern, we need to create Interpreter context
 * engine that will do the interpretation work and then we need to create different
 * Expression implementations that will consume the functionalities provided by the
 * interpreter context. Finally we need to create the client that will take the input
 * from user and decide which Expression to use and then generate output for the user.
 *
 * <ul>
 *     <li>Interpreter pattern can be used when we can create a syntax tree for the
 *     grammar we have.</li>
 *     <li>Interpreter pattern requires a lot of error checking and a lot of expressions
 *     and code to evaluate them, it gets complicated when the grammar becomes more
 *     complicated and hence hard to maintain and provide efficiency.</li>
 *     <li>{@code java.util.Pattern} and subclasses of {@code java.text.Format} are some
 *     of the examples of interpreter pattern used in JDK.</li>
 * </ul>
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public interface Expression {

    String interpret(InterpreterContext ic);
}
