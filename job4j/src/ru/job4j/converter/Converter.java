package ru.job4j.converter;

public class Converter {

    private int rubleToEuro(int value) {
        int euro = 70;
        return value / euro;
    }

    private int rubleToDollar(int value) {
        int dollar = 60;
        return value / dollar;
    }

    public static void main(String[] args) {
        Converter conv = new Converter();
        int value = 210;
        System.out.printf("%s rubles are %s euro%n", value, conv.rubleToEuro(value));
        System.out.printf("%s rubles are %s dollars", value, conv.rubleToDollar(value));
    }
}
