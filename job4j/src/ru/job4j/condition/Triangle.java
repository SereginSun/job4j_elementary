package ru.job4j.condition;

public class Triangle {

    public boolean exist(double ab, double bc, double ac) {
        return ab + bc > ac && bc + ac > ab && ab + ac > bc;
    }
}
