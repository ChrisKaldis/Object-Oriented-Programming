package playground.arrays;

public class ArrayInit {

    public static void main(String[] args) {
        int[][] init = {{0, 0, 0}, {0, 0, 0}};
        printArray2D(init);
        System.out.println("\nDeclare an array of specific size using the new keyword");
        int[][] arr = new int[3][4];
        initArray(arr, 3, 4);
        printArray2D(arr);
        doubleValue(arr, 5);
        System.out.println("\nArray after calling the doubleValue() method");
        printArray2D(arr);
    }

    private static void initArray(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (i * col) + j;
            }
        }
    }

    private static void printArray2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void doubleValue(int[][] arr, int index) {
        if (index >= arr[0].length) {
            int i = index / arr[0].length;
            int j = index % arr[0].length;
            arr[i][j] = 2 * arr[i][j];
        } else {
            arr[0][index] = 2 * arr[0][index];
        }
    }

}
