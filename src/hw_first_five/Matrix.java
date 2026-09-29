package hw_first_five;
public class Matrix {

    private int[][] matrix;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
    }

    public void setElement(int row, int column, int value) {
        matrix[row][column] = value;
    }
    public double getElement(int row, int column) {
        return matrix[row][column];
    }

    public Matrix sum(Matrix other) {

        if (rows != other.rows || columns != other.columns) {
            System.out.println("Матрицы должны иметь одинаковый размер!");
            return null;
        }

        Matrix result = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] =
                        matrix[i][j] + other.matrix[i][j];
            }
        }

        return result;
    }

    public Matrix multiply(int number) {
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = matrix[i][j] * number;
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}