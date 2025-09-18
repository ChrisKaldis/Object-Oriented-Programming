import  java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        try (Scanner myInput = new Scanner(System.in)) {
            System.out.println("Give width of rectangle");
            float w = myInput.nextFloat();
            System.out.println("Give height of rectangle");
            float h = myInput.nextFloat();
            System.out.println("Give x of bottom left corner.");
            float x = myInput.nextFloat();
            System.out.println("Give y of bottom left corner.");
            float y = myInput.nextFloat();
            
            Rectangle objRect = new Rectangle(x, y, w, h);
            
            System.out.println("Give x of a point.");
            float px = myInput.nextFloat();
            System.out.println("Give y of a point.");
            float py = myInput.nextFloat();
            
            if (objRect.contains(px, py)) {
                System.out.println("Point is inside rectangle.");
            } else {
                System.out.println("Point is outside rectangle.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating rectangle: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred. Please enter valid numbers.");
        }
    }
}
