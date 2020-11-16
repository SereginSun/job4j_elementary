package ru.job4j.loop;

public class Slash {

    public void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int colm = 0; colm < size; colm++) {
                if (row == colm) {
                    System.out.print("0");
                } else if (row + colm == size - 1) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
