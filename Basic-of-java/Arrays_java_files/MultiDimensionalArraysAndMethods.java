import java.util.Arrays;

public class MultiDimensionalArraysAndMethods {
    public static void main(String[] args) {
        // Multi-Dimensional Arrays: 3D Array
        int[][][] threeDArray = new int[2][3][4];
        threeDArray[0][1][2] = 5;
        System.out.println("3D Array Element: " + threeDArray[0][1][2]);

        // Ragged Arrays
        int[][] raggedArray = new int[3][];
        raggedArray[0] = new int[2];
        raggedArray[1] = new int[3];
        raggedArray[2] = new int[4];
        System.out.println("Ragged Array created with different lengths");

        // Arrays and Methods: Passing Array to a Method
        int[] array = {10, 20, 30};
        printArray(array);

        // Arrays and Methods: Returning Array from a Method
        int[] newArray = createArray();
        System.out.println("Array returned from method: " + Arrays.toString(newArray));
    }

    // Method to print array elements
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    // Method to create and return an array
    public static int[] createArray() {
        return new int[] {1, 2, 3};
    }
}
