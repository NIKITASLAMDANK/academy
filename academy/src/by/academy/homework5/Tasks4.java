package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Tasks4 {

    private static final Random random = new Random();
    private static final int NUMBER_OF_PUPILS = 18;
    private static final int MAX_MARK = 10;

    public static void main(String[] args) {
        Iterator<Integer> iterator = listOfMarks().iterator();
        int maxMark = Integer.MIN_VALUE;
        int temp;

        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp > maxMark) {
                maxMark = temp;
            }
        }
        System.out.println("Самая высокая оценка - " + maxMark);
    }

    private static List<Integer> listOfMarks() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_PUPILS; i++) {
            list.add(1 + random.nextInt(MAX_MARK));
        }
        return list;
    }
}