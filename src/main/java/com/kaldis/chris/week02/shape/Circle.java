package com.kaldis.chris.week02.shape;

import com.kaldis.chris.week02.element.Point;

public class Circle {
    private Point point;
    private double radius;

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public double getArea() {
        double PI = 3.14159;

        return PI * radius * radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

}
