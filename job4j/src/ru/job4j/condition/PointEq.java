package ru.job4j.condition;

public class PointEq {

    public boolean eq(Point firstPoint, Point secondPoint) {
        return firstPoint.getX() == secondPoint.getX() && firstPoint.getY() == secondPoint.getY();
    }
}
