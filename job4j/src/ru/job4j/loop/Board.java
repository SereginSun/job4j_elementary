package ru.job4j.loop;

public class Board {

    public void paint(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row % 2 == 0 && col % 2 == 0) {
                    System.out.print("X");
                } else if (row % 2 != 0 && col % 2 != 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
