package ru.job4j.condition;

public class Club {

    public String permission(boolean hasMoney, boolean beFriend) {
        return hasMoney || beFriend ? "I can go to the club." : "I can't.";
    }
}
