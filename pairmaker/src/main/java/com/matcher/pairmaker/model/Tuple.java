package com.matcher.pairmaker.model;

public class Tuple<T, S> {
    private T first;
    private S second;
    private final double distance;


    public Tuple(T first, S second, double distance) {
        this.first = first;
        this.second = second;
        this.distance = distance;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "first: " + first + '\n' +
                ", second: " + second + '\n' +
                ", distance= " + distance +
                '}' + '\n' + '\n';
    }
}
