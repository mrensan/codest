package net.ensan.codest.experiment;

public class NegativeNumberDemo {
    public void showByteUpAndDown() {
        int value = Integer.MIN_VALUE;
        printRange(Integer.MIN_VALUE, 10);
        System.out.println("...");
        printRange(-10, 20);
        System.out.println("...");
        printRange(Integer.MAX_VALUE - 10, 11);
    }

    private int printRange(int value, int count) {
        for(int i = 0; i < count; i++) {
            System.out.println(String.format("Binary value of %d is: %16s (0x%08X)", value, Integer.toBinaryString(value).replace(' ', '0'), value));
            value++;
        }
        return value;
    }

    public static void main(String[] args) {
        new NegativeNumberDemo().showByteUpAndDown();
    }
}
