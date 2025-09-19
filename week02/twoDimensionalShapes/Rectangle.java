package week02.twoDimensionalShapes;

import week02.basicElements.Point;

/**
 * Represents a Rectangle shape.
 * This class extends the abstract Shape class and provides the specific
 * implementation for calculating the area of a rectangle.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    /**
     * Constructs a Rectangle with a specified reference point,
     * width, and height.
     * 
     * @param point The reference point for the rectangle 
     * (e.g., the bottom-left corner).
     * @param w The width of the rectangle. Must be a positive value.
     * @param h The height of the rectangle. Must be a positive value.
     */
    public Rectangle(Point point, double w, double h) {
        super(point);
        this.width = w;
        this.height = h;
    }

    /**
     * Calculates the area of the rectangle.
     * The formula used is width * height.
     *
     * @return The area of the rectangle.
     */
    @Override
    public double getArea() {
        return width * height;
    }
}
