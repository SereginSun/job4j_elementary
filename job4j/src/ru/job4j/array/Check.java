package ru.job4j.array;

public class Check {

    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length - 1; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}