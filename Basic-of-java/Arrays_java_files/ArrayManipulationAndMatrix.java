import java.util.Arrays;

public class ArrayManipulationAndMatrix {
    public static void main(String[] args) {
        // Array Manipulation: Finding the Largest Element
        int[] numbers = {10, 20, 30, 40, 50};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number: " + max);

        // Array Manipulation: Reversing an Array
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(numbers));

        // Matrix Operations (2D Arrays)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of matrix elements: " + sum);
    }
}
