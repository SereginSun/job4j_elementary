package ru.job4j.calculator;

public class Fit {

    public double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public double womanWeight(short height) {
        return (height - 110) * 1.15;
    }
}
