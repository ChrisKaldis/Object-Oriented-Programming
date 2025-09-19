package week02.mainPacket;

import java.util.Scanner;
import java.util.InputMismatchException;
import week02.basicElements.Point;
import week02.twoDimensionalShapes.*;

/**
 * The main entry point for the shape creation application.
 * This class handles user interaction for creating a geometric shape 
 * (Rectangle or Circle) and then calculates and displays its area.
 */
public class MainClass {
    public static void main(String[] Args) {
        // Use a try-with-resources statement to ensure the scanner is 
        // automatically closed.
        try (Scanner scanner = new Scanner(System.in)) {

            Point centerPoint = getPointFromUser(scanner);
            Shape myShape = createShape(scanner, centerPoint);

            if (myShape != null) {
                double area = myShape.getArea();
                System.out.printf("The area of your shape is: %.2f%n", area);
            } else {
                System.out.println("No valid shape was created.");
            }

        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    /**
     * Prompts the user for x and y coordinates and returns a Point object.
     * 
     * @param scanner The Scanner object to read user input.
     * @return A new Point object with coordinates from the user.
     */
    private static Point getPointFromUser(Scanner scanner) {
        System.out.println("Enter the x-coordinate of the reference point:");
        int x = scanner.nextInt();
        System.out.println("Enter the y-coordinate of the reference point:");
        int y = scanner.nextInt();

        return new Point(x, y);
    }

     /**
     * Prompts the user to select a shape and its dimensions, then 
     * creates the shape.
     * 
     * @param scanner The Scanner object to read user input.
     * @param point The reference point for the shape.
     * @return A new object that implements the Shape interface 
     * (e.g., Circle, Rectangle), or null if the choice is invalid.
     */
    private static Shape createShape(Scanner scanner, Point point) {
        System.out.println("Select the shape you want to create:");
        System.out.println("1) Rectangle");
        System.out.println("2) Circle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double width = getPositiveDouble(scanner, "Enter the width:");
                double height = getPositiveDouble(scanner, "Enter the height:");
                return new Rectangle(point, width, height);

            case 2:
                double radius = getPositiveDouble(scanner, "Enter the radius:");
                return new Circle(point, radius);

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                return null;
        }
    }

    /**
     * Prompts the user for a double value and ensures it is positive.
     * 
     * @param scanner The Scanner object to read user input.
     * @param prompt The message to display to the user.
     * @return A positive double value entered by the user.
     */
    private static double getPositiveDouble(Scanner scanner, String prompt) {
        double value;

        do {
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value <= 0) {
                System.out.println("Value must be positive. Please try again.");
            }
        } while (value <= 0);

        return value;
    }
}
