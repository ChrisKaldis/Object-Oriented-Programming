package week02.basicElements;

/**
 * Represents a point in a 2D coordinate system using integer coordinates.
 * This is a fundamental building block for defining locations of shapes.
 */
public class Point {
    private int x;
    private int y;

    /**
     * Constructs a Point with specified x and y coordinates.
     *
     * @param x The horizontal coordinate of the point.
     * @param y The vertical coordinate of the point.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-coordinate of the point.
     *
     * @return The integer value of the x-coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the y-coordinate of the point.
     *
     * @return The integer value of the y-coordinate.
     */
    public int getY() {
        return y;
    }

    /**
     * Provides a string representation of the Point object.
     *
     * @return A formatted string, e.g., "Point(x=1, y=2)".
     */
    @Override
    public String toString() {
        return "Point(x=" + x + ", y=" + y + ")";
    }
}
