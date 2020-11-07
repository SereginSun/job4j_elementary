package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private static double distance(Point first, Point second) {
        return Math.sqrt(Math.pow((first.x - second.x), 2) + Math.pow((first.y - second.y), 2));
    }

    public static void main(String[] args) {
        Point firstPoint = new Point(1, 1);
        Point secondPoint = new Point(5, 4);
        System.out.printf("The distance from point %s to point %s is %s",
                firstPoint,
                secondPoint,
                distance(firstPoint, secondPoint));
    }

    @Override
    public String toString() {
        return "Point{"
                + "x=" + x
                + ", y=" + y
                + '}';
    }
}
