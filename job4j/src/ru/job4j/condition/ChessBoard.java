package ru.job4j.condition;

public class ChessBoard {

    public int way(int x1, int y1, int x2, int y2) {
        int distX = Math.abs(x2 - x1);
        int distY = Math.abs(y2 - y1);
        return distX == distY ? distX : 0;
    }
}
