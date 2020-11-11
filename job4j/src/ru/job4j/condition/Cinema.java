package ru.job4j.condition;

public class Cinema {

    public String access(int age) {
        return age >= 18 ? "Welcome to the cinema." : "It is not for you.";
    }

    public String permission(boolean allowByParent, boolean hasMoney) {
        return allowByParent && hasMoney ? "I can go to the cinema." : "I can't.";
    }
}
