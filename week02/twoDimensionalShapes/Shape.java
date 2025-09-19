package week02.twoDimensionalShapes;

import week02.basicElements.Point;

/**
 * An abstract base class representing a geometric shape in a 2D plane.
 */
public abstract class Shape {
    /**
     * A reference point for the shape, such as the center or a corner.
     * It is 'protected' to allow direct access by subclasses.
     */
    protected Point point;

    /**
     * Constructs a Shape with a given reference point.
     *
     * @param point The reference point for the shape.
     */
    public Shape(Point point) {
        this.point = point;
    }

    /**
     * An abstract method to calculate the area of the shape.
     * Each concrete subclass must provide its own implementation for 
     * this method.
     *
     * @return The calculated area of the shape as a double.
     */
    public abstract double getArea();

    /**
     * Gets the reference point of the shape.
     *
     * @return The Point object representing the shape's reference location.
     */
    public Point getReferencePoint() {
        return point;
    }
}
