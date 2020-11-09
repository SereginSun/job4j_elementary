package ru.job4j.converter;

public class Converter {

    public int rubleToEuro(int value) {
        int euro = 70;
        return value / euro;
    }

    public int rubleToDollar(int value) {
        int dollar = 60;
        return value / dollar;
    }
}
