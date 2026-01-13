package com.kaldis.chris.week01;

public class Rectangle {
    private float x;
    private float y;
    private float width;
    private float height;
    public static int numObjectsCreated = 0;

    public Rectangle(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        numObjectsCreated++;
    }

    public boolean contains(float xPoint, float yPoint) {
        boolean result;

        if (xPoint > this.x && xPoint < this.x + this.width
                && yPoint > this.y && yPoint < this.y + this.height) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
