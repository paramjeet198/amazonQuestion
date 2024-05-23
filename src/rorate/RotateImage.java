package rorate;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        solution(arr);
    }

    private static void solution(int[][] matrix) {

        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        System.out.println("Original ");
        printMatrix(matrix);

        for (int i = 0; i < rowCount - 1; i++) {
            for (int j = i + 1; j < colCount; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("After Transpose ");
        printMatrix(matrix);

        for (int[] arr : matrix) {
            reverse(arr);
        }
        System.out.println("After Reverse ");
        printMatrix(matrix);
    }

    public static void reverse(int[] matrix) {

        int i = 0;
        int j = matrix.length - 1;

        while (i < j) {
            int temp = matrix[j];
            matrix[j] = matrix[i];
            matrix[i] = temp;

            i++;
            j--;
        }

    }


    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


