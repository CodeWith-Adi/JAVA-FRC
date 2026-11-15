import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Practice Exercise - 1
        // Calculate the transpose of a 2D matrix

        /*
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        */


        // Practice Exercise - 2
        // Add two 2D arrays element by element

        /*
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int[][] result = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the matrices:");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        */


        // Practice Exercise - 3
        // Print square and cube of array elements

        /*
        int[] numbers = {2, 3, 4, 5};

        printSquareAndCube(numbers);
        */


        // Practice Exercise - 4
        // Find absolute values of array elements

        /*
        int[] numbers = {-10, 20, -30, 40, -50};

        findAbsoluteValues(numbers);
        */


        // Practice Exercise - 5
        // Find smallest and largest number using Math methods

        /*
        int[] numbers = {45, 12, 78, 5, 90, 23};

        findSmallestAndLargest(numbers);
        */

    }


    // Method for Practice Exercise - 3
    public static void printSquareAndCube(int[] numbers) {

        for (int num : numbers) {
            System.out.println("Number: " + num);
            System.out.println("Square: " + Math.pow(num, 2));
            System.out.println("Cube: " + Math.pow(num, 3));
            System.out.println();
        }
    }


    // Method for Practice Exercise - 4
    public static void findAbsoluteValues(int[] numbers) {

        for (int num : numbers) {
            System.out.println("Absolute value of " + num + " = " + Math.abs(num));
        }
    }


    // Method for Practice Exercise - 5
    public static void findSmallestAndLargest(int[] numbers) {

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            smallest = Math.min(smallest, numbers[i]);
            largest = Math.max(largest, numbers[i]);
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}