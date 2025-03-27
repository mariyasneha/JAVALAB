import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        
        System.out.print("Enter number of rows of first matrix: ");
        int row1 = sc.nextInt();
        System.out.print("Enter number of columns of first matrix: ");
        int col1 = sc.nextInt();
        
        System.out.println("Enter number of rows of second matrix: ");
        int row2 = sc.nextInt();
        System.out.println("Enter number of columns of second matrix: ");
        int col2 = sc.nextInt();

        // Checking if matrices have the same dimension
        if (row1 == row2 && col1 == col2) {
            int[][] matrix1 = new int[row1][col1];
            int[][] matrix2 = new int[row2][col2];
            int[][] matrixResult = new int[row1][col1];

            System.out.println("Enter elements into matrix 1:");
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col1; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements into matrix 2:");
            for (i = 0; i < row2; i++) {
                for (j = 0; j < col2; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }

            // Adding matrices
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col1; j++) {
                    matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            // Displaying the resultant matrix
            System.out.println("The Resultant Matrix is:");
            for (i = 0; i < row1; i++) {
                for (j = 0; j < col1; j++) {
                    System.out.print(matrixResult[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            // If matrices cannot be added due to mismatched dimensions
            System.out.println("Matrices are of different order. Addition not possible.");
        }

        sc.close(); // Closing scanner resource
    }
}
