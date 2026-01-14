package com.kaldis.chris.week02.main_packet;

import com.kaldis.chris.week02.element.Point;
import com.kaldis.chris.week02.shape.Circle;
import com.kaldis.chris.week02.shape.Rectangle;

import java.util.Scanner;

public class Week2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("~Week 02~");

        Point rectanglePoint = getPointFromUser(scanner);
        Rectangle myRectangle = getRectangleFromUser(scanner, rectanglePoint);
        System.out.println("A Rectangle with area " + myRectangle.getArea() + " was created.");

        Point circleCenter = getPointFromUser(scanner);
        Circle myCircle = getCircleFromUser(scanner, circleCenter);
        System.out.println("A circle with area " + myCircle.getArea() + " was created.");

        scanner.close();
    }

    private static Point getPointFromUser(Scanner scanner) {
        System.out.println("Let's create a Point.");
        System.out.println("Give x:");
        double x = scanner.nextDouble();
        System.out.println("Give y:");
        double y = scanner.nextDouble();

        return new Point(x, y);
    }

    private static Rectangle getRectangleFromUser(Scanner scanner, Point point) {
        System.out.println("Let's create a Rectangle.");
        System.out.println("Give width:");
        double width = scanner.nextDouble();
        System.out.println("Give height:");
        double height = scanner.nextDouble();

        return new Rectangle(point, width, height);
    }

    private static Circle getCircleFromUser(Scanner scanner, Point point) {
        System.out.println("Let's create a Circle.");
        System.out.println("Give radius:");
        double radius = scanner.nextDouble();

        return new Circle(point, radius);
    }

}
