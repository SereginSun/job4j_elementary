package ru.job4j.array;

public class ArrayChar {

    public boolean startWith(char[] word, char[] pref) {
        boolean result = true;
        if (pref.length > word.length || pref.length == 0) {
            result = false;
        }
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
