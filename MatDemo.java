public class MatDemo {
    public static void main(String[] args) {
        // Creating two matrices with random values
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);

        // Displaying the original matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        // Performing matrix addition
        Matrix sumMatrix = matrix1.add(matrix2);
        System.out.println("\nMatrix Addition Result:");
        displayMatrix(sumMatrix);

        // Performing matrix multiplication
        Matrix productMatrix = matrix1.multiply(matrix2);
        System.out.println("\nMatrix Multiplication Result:");
        displayMatrix(productMatrix);

        // Performing matrix transpose
        Matrix transposeMatrix = matrix1.transpose();
        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix);
    }

    // Helper method to display a matrix
    private static void displayMatrix(Matrix matrix) {
        int[][] mat = matrix.getMatrix();
        for (int[] row : mat) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}