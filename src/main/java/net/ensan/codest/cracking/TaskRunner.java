package net.ensan.codest.cracking;

/**
 * volatile application
 */
public class TaskRunner {

    private static int number;
    private volatile static boolean ready;

    private static class Reader extends Thread {

        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
            }

            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starts now:");
        new Reader().start();
        number = 42;
        ready = true;
    }
}