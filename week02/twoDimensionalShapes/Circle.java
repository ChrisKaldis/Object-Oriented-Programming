package week02.twoDimensionalShapes;

import static java.lang.Math.PI;
import week02.basicElements.Point;

/**
 * Represents a Circle shape.
 * This class extends the abstract Shape class and provides the specific
 * implementation for calculating the area of a circle.
 */
public class Circle extends Shape {
    private double radius;
    
    /**
     * Constructs a Circle with a specified center point and radius.
     *
     * @param point The center point of the circle.
     * @param radius The radius of the circle. Must be a positive value.
     */
    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * The formula used is PI * radius^2.
     *
     * @return The area of the circle.
     */
    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
