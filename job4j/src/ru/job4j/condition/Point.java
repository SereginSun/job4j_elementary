package ru.job4j.condition;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
    }
}
