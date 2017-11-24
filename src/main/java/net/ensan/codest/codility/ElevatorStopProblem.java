package net.ensan.codest.codility;

import java.util.*;

/**
 * <h2>Problem Description:</h2>
 *
 * There is an elevator in a building with M floors. This elevator
 * can take a max of X people at a time or max of total weight Y.
 * Given that a set of people and their weight and the floor they
 * need to stop, how many stops has the elevator taken to serve all
 * the people? Consider the elevator serves in "first come first serve"
 * basis and the order for the queue can not be changed.
 *
 * <p>Example:</p>
 *
 * Let Array A be the weight of each person A = [60, 80, 40].
 * Let Array B be the floors where each person needs to be
 * dropped off B = [2, 3, 5].
 * The building has 5 floors, maximum of 2 persons are allowed
 * in the elevator at a time with max weight capacity being 200.
 * For this example, the elevator would take total of 5 stops in
 * floors: 2, 3, G, 5 and finally G.
 *
 * @author shahram at gmail.com
 */
public class ElevatorStopProblem {

    /**
     * @param A Array of passengers weights
     * @param B Array of passenger destination floors
     * @param M Number of floors in the building
     * @param X Elevator max passenger capacity
     * @param Y Elevator max weight capacity
     * @return Number of total stops
     */
    public int calculateElevatorStopProblem(int[] A, int[] B, int M, int X, int Y) {
        int trip = 0;
        int tripWeight = 0;
        List<Integer> rounds = new ArrayList<>();
        Set<Integer> uniqueFloors = null;

        for (int i = 0 ; i < A.length ; i++) {
            if (rounds.size() == X || tripWeight + A[i] > Y ) {
                uniqueFloors = new HashSet<>(rounds);
                trip += uniqueFloors.size();
                trip++; // back to G floor
                tripWeight = 0;
                rounds.clear();
            }
            rounds.add(B[i]);
            tripWeight += A[i];
        }

        uniqueFloors = new HashSet<>(rounds);
        trip += uniqueFloors.size();
        trip++; // back to G floor

        return trip;
    }
}
