package com.kaldis.chris.week02.shape;

import com.kaldis.chris.week02.element.Point;

public class Rectangle {
    private Point point;
    private double width;
    private double height;

    public Rectangle(Point point, double width, double height) {
        this.point = point;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

}
