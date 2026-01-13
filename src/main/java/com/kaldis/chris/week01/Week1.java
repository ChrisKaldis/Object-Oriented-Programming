package com.kaldis.chris.week01;

import java.util.Scanner;

public class Week1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x, y, width, height, xPoint, yPoint;

        System.out.println("~Week 01~");
        System.out.println("Create a Rectangle\nGive x value of bottom left point:");
        x = scanner.nextFloat();
        System.out.println("Give y value of bottom left point:");
        y = scanner.nextFloat();
        System.out.println("Give the width of the rectangle:");
        width = scanner.nextFloat();
        System.out.println("Give the height of the rectangle:");
        height = scanner.nextFloat();

        Rectangle rectangle = new Rectangle(x, y, width, height);
        System.out.println("Rectangles created:" + Rectangle.numObjectsCreated);

        System.out.println("Give the value of point's x coordinate:");
        xPoint = scanner.nextFloat();
        System.out.println("Give the value of point's y coordinate:");
        yPoint = scanner.nextFloat();

        if (rectangle.contains(xPoint, yPoint)) {
            System.out.println("Point is inside the rectangle");
        } else {
            System.out.println("Point is outside the rectangle");
        }
    }

}
