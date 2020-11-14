package ru.job4j.loop;

public class Counter {

    public int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum += index;
        }
        return sum;
    }
}
