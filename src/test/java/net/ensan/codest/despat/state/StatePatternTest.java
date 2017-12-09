package net.ensan.codest.despat.state;

import org.junit.Test;

import static org.junit.Assert.*;

public class StatePatternTest {
    @Test
    public void stateTest() throws Exception {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopSate = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopSate);
        context.doAction();
    }

}