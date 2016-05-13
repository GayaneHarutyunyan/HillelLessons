package Lesson25.generics;

public class Pair<T> {
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getSecond() {
        return second;
    }

    public T getFirst() {
        return first;
    }
}
