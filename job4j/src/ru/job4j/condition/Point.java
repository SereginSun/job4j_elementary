package ru.job4j.condition;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point first, Point second) {
        return Math.sqrt(Math.pow((first.x - second.x), 2) + Math.pow((first.y - second.y), 2));
    }
}
