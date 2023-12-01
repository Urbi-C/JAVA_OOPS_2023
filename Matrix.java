import java.util.Random;

public class Matrix {
    private int rows;
    private int columns;
    private int[][] matrix;

    // Constructor to create a matrix with random values
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
        Random rand = new Random();

        // Populate the matrix with random values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = rand.nextInt(10); // Generating random values between 0 and 9
            }
        }
    }

    // Accessor method to get the matrix
    public int[][] getMatrix() {
        return matrix;
    }

    // Mutator method to set the matrix
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // Method to perform matrix addition
    public Matrix add(Matrix otherMatrix) {
        if (this.rows != otherMatrix.rows || this.columns != otherMatrix.columns) {
            throw new IllegalArgumentException("Matrix dimensions do not match for addition.");
        }

        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = this.matrix[i][j] + otherMatrix.matrix[i][j];
            }
        }

        return result;
    }

    // Method to perform matrix multiplication
    public Matrix multiply(Matrix otherMatrix) {
        if (this.columns != otherMatrix.rows) {
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
        }

        Matrix result = new Matrix(this.rows, otherMatrix.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < otherMatrix.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    result.matrix[i][j] += this.matrix[i][k] * otherMatrix.matrix[k][j];
                }
            }
        }

        return result;
    }

    // Method to perform matrix transpose
    public Matrix transpose() {
        Matrix result = new Matrix(columns, rows);

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                result.matrix[i][j] = this.matrix[j][i];
            }
        }

        return result;
    }
}


