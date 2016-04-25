package com.mrensan.codest.bas;

/**
 * Prints some asterisk in desired format.
 *
 * @author shahram at gmail.com
 */
public class AsteriskForLoop {

    /**
     * n = 4
     *  *
     *  **
     *  ***
     *  ****
     */
    public void simpleTriangleAsterisk(int n) {
        for(int i = 0 ; i < n ; i++ ) {
            for (int j = 0 ; j < i + 1 ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /**
     * Each row should contain 2n-1, 2n-3, ..., 3, 1 asterisks.
     * n = 4
     *  *******
     *   *****
     *    ***
     *     *
     */
    public void symmetricalTriangleAsterisk(int n) {
        for (int i = n ; i > 0 ; i--) {
            for (int j = 0 ; j < n - i ; j++) {
                System.out.print(' ');
            }
            for (int k = 0 ; k < 2 * i - 1 ; k++ ) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
