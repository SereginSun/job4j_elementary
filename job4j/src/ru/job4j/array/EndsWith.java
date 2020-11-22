package ru.job4j.array;

public class EndsWith {

    public boolean check(char[] word, char[] post) {
        boolean result = true;
        if (post.length > word.length || post.length == 0) {
            result = false;
        }
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
