package ru.job4j.calculator;

public class Fit {

    private double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    private double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        Fit fit = new Fit();
        short height = 174;
        System.out.printf("The ideal weight for a man who is %s tall is %s%n", height, fit.manWeight(height));
        System.out.printf("The ideal weight for a woman who is %s tall is %s%n", height, fit.womanWeight(height));
    }
}
