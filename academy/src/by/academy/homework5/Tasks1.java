package by.academy.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Tasks1 {
    public static void main(String[] args) {
        Collection<Object> list = new ArrayList<>();
        list.add(10);
        list.add("5");
        list.add(10);
        list.add("5");

        System.out.println(list);
        list = collectionWithoutDuplicates(list);
        System.out.println(list);
    }

    private static Collection<Object> collectionWithoutDuplicates(Collection<Object> collection) {
        return new HashSet<>(collection);
    }
}