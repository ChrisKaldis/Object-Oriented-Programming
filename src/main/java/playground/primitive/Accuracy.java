package playground.primitive;

import java.math.BigDecimal;

public class Accuracy {

    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.1;

        // Intellij actually tells you that it is always false.
        if (a * b == 0.01) {
            System.out.println("Everything is fine.");
        } else {
            System.out.println("Welcome to IEEE 754 floating-point.");
        }

        if (checkUsingBigDecimal("0.1", "0.1") && checkUsingRounding(a, b)) {
            System.out.println("As you can see there are some alternatives.");
        }

    }

    private static boolean checkUsingBigDecimal(String a, String b) {
        BigDecimal aBig = new BigDecimal(a);
        BigDecimal bBig = new BigDecimal(b);
        boolean works = false;

        if (aBig.multiply(bBig).equals(new BigDecimal("0.01"))) {
            System.out.println("Using BigDecimal works fine.");
            works = true;
        } else {
            System.out.println("Using BigDecimal doesn't work.");
        }

        return works;
    }

    private static boolean checkUsingRounding(double a, double b) {
        double product = a * b;
        double scale = 10_000.0;
        boolean works = false;

        if (Math.round(product * scale) / scale == 0.01) {
            System.out.println("Using Rounding works fine.");
            works = true;
        } else {
            System.out.println("Using rounding doesn't work.");
        }

        return works;
    }

}
