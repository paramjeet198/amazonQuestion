package rorate;

public class RotateImageExtraSpace {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        solution(arr);
    }

    private static void solution(int[][] matrix) {

        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int[][] ans = new int[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
//                ans[j][rowCount - 1 - i] = matrix[i][j]; // rotation
                ans[i][j] = matrix[j][i]; // transpose
            }
        }

        System.out.println("After Rotate 90 degree ");
        printMatrix(ans);
    }


    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


