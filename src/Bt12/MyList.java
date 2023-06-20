package bt12;

import java.util.ArrayList;

public class MyList<T> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    private ArrayList<T> array = new ArrayList<>();

    public MyList() {
    }

    public void add(int index, T element) {
        this.array.add(index, element);
    }

    public T remove(int index) {
        T temp = array.get(index);
        array.remove(index);
        return temp;
    }

    public int size() {
        return array.size();
    }

    public ArrayList<T> clone() {
        return this.array;
    }

    public boolean contains(T element) {
        return this.array.contains(element);
    }

    public int indexOf(T element) {
        return this.array.indexOf(element);
    }

    public boolean add(T element) {
        return this.array.add(element);
    }

    public void ensureCapacity(int minCapacity) {
        this.array = new ArrayList<>(minCapacity);
    }

    public T get(int index) {
        return this.array.get(index);
    }

    public void clear() {
        this.array.clear();
    }

    public void print() {
        for (T i : array) {
            System.out.print(i + " ");
        }
    }
}
