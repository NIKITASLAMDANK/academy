package by.academy.homework5;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Tasks2 {

    private static final Random random = new Random();
    private static final int NUMBERS_OF_ELEMENTS = 1_000_000;
    private static final int NUMBERS_OF_GETTING_ELEMENTS = 100_000;
    private static final List<Integer> arrayList = new ArrayList<>();
    private static final List<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {

        System.out.println("Добавление 1000000 элементов в arrayList");
        Instant start = Instant.now();
        addElements(arrayList);
        Instant end = Instant.now();
        getTime(start, end);
        System.out.println("");

        System.out.println("Добавление 1000000 элементов в linkedList");
        start = Instant.now();
        addElements(linkedList);
        end = Instant.now();
        getTime(start, end);
        System.out.println("");

        System.out.println("Взятие 100000 элементов в arrayList");
        start = Instant.now();
        getElement(arrayList);
        end = Instant.now();
        getTime(start, end);
        System.out.println("");

        System.out.println("Взятие 100000 элементов в linkedList");
        start = Instant.now();
        getElement(linkedList);
        end = Instant.now();
        getTime(start, end);
        System.out.println("");
    }

    private static void addElements(List<Integer> list) {
        for (int i = 0; i < NUMBERS_OF_ELEMENTS; i++) {
            list.add(random.nextInt());
        }
    }

    private static void getElement(List<Integer> list) {
        for (int i = 0; i < NUMBERS_OF_GETTING_ELEMENTS; i++) {
            list.get(random.nextInt(NUMBERS_OF_ELEMENTS));
        }
    }

    private static void getTime(Instant start, Instant end) {
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Время затраченное: " + timeElapsed.toMillis() + " миллисекунд");
    }
}