package playground.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Spiral {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(printSpiralOrder(arr));

        System.out.println(Arrays.deepToString(generateSpiralMatrix(3)));
    }

    private static int[][] generateSpiralMatrix(int size) {
        int[][] matrix = new int[size][size];
        int top = 0;
        int right = size - 1;
        int bottom = size - 1;
        int left = 0;
        int value = 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
            }
            left++;
        }

        return matrix;
    }

    private static List<Integer> printSpiralOrder(int[][] matrix) {
        List<Integer> spiral = new LinkedList<>();

        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }

        return spiral;
    }

}
