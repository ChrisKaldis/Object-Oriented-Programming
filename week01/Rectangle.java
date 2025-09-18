
public class Rectangle {
    private float x = 0;
    private float y = 0;
    private float width = 0;
    private float height = 0;
    private static int numberOfObjects = 0;

    /**
     * Constructor for the Rectangle class.
     * @param px The x-coordinate of the bottom-left corner.
     * @param py The y-coordinate of the bottom-left corner.
     * @param w The width of the rectangle.
     * @param h The height of the rectangle.
     */
    public Rectangle(float px, float py, float w, float h) {
        if (w < 0 || h < 0) {
            throw new IllegalArgumentException("Width and height cannot be negative.");
        }
        x = px;
        y = py;
        width = w;
        height = h;
        numberOfObjects++;
    }

    /**
     * Checks if a point is inside the rectangle's bounds.
     * Includes the bottom and left edges, excludes the top and right edges.
     * @param sx The x-coordinate of the point.
     * @param sy The y-coordinate of the point.
     * @return true if the point is inside the rectangle, otherwise false.
     */
    public boolean contains(float sx, float sy) {
        return (sx >= x && sx < x + width && sy >= y && sy < y + height);
    }

    /**
     * Static getter for the object count.
     * @return The total number of Rectangle objects created.
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
