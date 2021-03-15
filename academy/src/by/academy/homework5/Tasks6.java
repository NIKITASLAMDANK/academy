package by.academy.homework5;

import java.util.Random;

public class Tasks6 {

    private static final Random random = new Random();
    private static final int INITIAL_SIZE = 8;
    private static final int AMOUNT_OF_ELEMENTS = 10;

    public static void main(String[] args) {
        int[] array = new int[INITIAL_SIZE];
        try {
            for (int i = 0; i < AMOUNT_OF_ELEMENTS; i++) {
                array[i] = random.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is to small, expand the array");
        }
    }
}