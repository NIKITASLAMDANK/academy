package by.academy.homework4.task2;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(2);
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(array.get(0));
        System.out.println(array.getLast());
        System.out.println(array.getFirst());
        System.out.println(array.length());
        System.out.println(array.getIndexLastElement());
        System.out.println(array.remove(Integer.valueOf(2)));
        System.out.println(array.remove(1));
        System.out.println(array.getLast());
        System.out.println(array.length());
    }
}