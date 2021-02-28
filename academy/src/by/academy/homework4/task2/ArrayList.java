package by.academy.homework4.task2;

public class ArrayList<T> {
    private T[] array;
    private static final int DEFAULT_CAPACITY = 16;
    private int countElements = 0;


    @SuppressWarnings("unchecked")
    public ArrayList() {
        super();
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        super();
        if (capacity > 0) {
            this.array = (T[]) new Object[capacity];
        } else {
            this.array = (T[]) new Object[DEFAULT_CAPACITY];
        }
    }

    public void add(T element) {
        if (array.length == countElements) {
            expandArray();
        }
        array[countElements++] = element;
    }

    @SuppressWarnings("unchecked")
    private void expandArray() {
        T[] tmpProducts = (T[]) new Object[array.length * 2 + 1];
        System.arraycopy(array, 0, tmpProducts, 0, array.length);
        array = tmpProducts;
    }

    public T get(int i) {
        if (i >= 0 && i < countElements) {
            return array[i];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public T getLast() {
        return array[countElements - 1];
    }

    public T getFirst() {
        return array[0];
    }

    public int length() {
        return countElements;
    }

    public int getIndexLastElement() {
        return countElements - 1;
    }

    public boolean remove(T element) {
        int indexOfElement = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].equals(element)) {
                    indexOfElement = i;
                    break;
                }
            }
        }
        if (indexOfElement != -1) {
            System.arraycopy(array, indexOfElement + 1, array, indexOfElement, countElements - indexOfElement - 1);
            array[--countElements] = null;
            return true;
        }
        return false;
    }

    public boolean remove(int i) {
        if (i < countElements) {
            System.arraycopy(array, i + 1, array, i, countElements - i - 1);
            array[--countElements] = null;
            return true;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

}
