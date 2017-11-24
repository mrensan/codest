package net.ensan.codest.codility;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElevatorStopProblemTest {
    @Test
    public void calculateElevatorStopProblem() throws Exception {
        ElevatorStopProblem elevatorStopProblem = new ElevatorStopProblem();
        assertEquals(5, elevatorStopProblem.calculateElevatorStopProblem(
                new int[] {60, 80, 40},
                new int[] {2, 3, 5},
                5,
                2,
                200
        ));
        assertEquals(4, elevatorStopProblem.calculateElevatorStopProblem(
                new int[] {60, 80, 40},
                new int[] {2, 2, 5},
                5,
                2,
                200
        ));
        assertEquals(2, elevatorStopProblem.calculateElevatorStopProblem(
                new int[] {60, 80},
                new int[] {2, 2},
                5,
                2,
                200
        ));
    }

}