package playground.loops;

import java.util.Arrays;

public class AsciiShapes {

    public static void main(String[] args) {
        printSquare(6);
        printRightTriangle(7);
        printIsoscelesTriangle(8);
        printRhombus(9);
        printRhombus(10);
    }

    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                printOuterLine(n, '*', true);
            } else {
                printInnerLine(n, '*', '-');
            }
        }
    }

    private static void printRightTriangle(int n) {
        int length = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                printOuterLine(length, '*', true);
            } else {
                printInnerLine(length, '*', '-');
            }
            length += 2;
        }
    }

    private static void printIsoscelesTriangle(int n) {
        int spaces = n - 1;
        int length = 1;
        for (int i = 0; i < n; i++) {
            printOuterLine(spaces--, ' ', false);
            if (i == 0 ||  i == n - 1) {
                printOuterLine(length, '*', true);
            } else {
                printInnerLine(length, '*', '-');
            }
            length += 2;
        }
    }

    private static void printRhombus(int n) {
        int spaces = (n % 2 == 1) ? n / 2 : n / 2 - 1;
        int length = 1;

        for (int i = 0; i < n; i++) {
            printOuterLine(spaces, ' ', false);
            if (i == 0 || i == n - 1) {
                printOuterLine(length, '*', true);
            } else {
                printInnerLine(length, '*', '-');
            }

            if (n % 2 == 0 && i == n / 2 - 1) {
                continue;
            }

            if (i < n / 2) {
                length += 2;
                spaces--;
            } else {
                length -= 2;
                spaces++;
            }
        }
    }

    private static void printOuterLine(int n, char ch, boolean newLine) {
        char[] outerLine = new char[n];
        Arrays.fill(outerLine, ch);

        if (newLine) {
            System.out.println(outerLine);
        } else {
            System.out.print(outerLine);
        }
    }

    private static void printInnerLine(int n, char edge, char inside) {
        char[] innerLine = new char[n];
        innerLine[0] = edge;
        for (int i = 1; i < n - 1; i++) {
            innerLine[i] = inside;
        }
        innerLine[n - 1] = edge;

        System.out.println(innerLine);
    }

}
