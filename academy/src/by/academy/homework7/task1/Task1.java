package by.academy.homework7.task1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {

        List<Long> list = generateLongList(100, 100);

        System.out.println(list.stream().map(value -> (value * Math.PI - 20)).filter(value -> value < 100).sorted().
                skip(3).distinct().collect(Collectors.toMap(value -> value, value -> ("Число: " + value))));
    }

    private static List<Long> generateLongList(int seed, int size) {
        return Stream.generate(() -> (long) new Random().nextInt(seed + 1)).limit(size).collect(Collectors.toList());
    }
}