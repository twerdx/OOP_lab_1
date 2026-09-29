package myFiles;

import java.util.Arrays;
import java.util.Scanner;

public class MyMatrix {
    int[][] matrix;
    int col;
    int row;

    public MyMatrix() {}

    public int[][] matrixFill() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Row ");
            row = scanner.nextInt();
            System.out.println("Col ");
            col = scanner.nextInt();
            if (col>=1 && row >= 0) {
                matrix = new int[row][col];

            }else{
                System.out.println("Такой матрицы не существует");
            }
        }

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Элемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    public int getMatrix(int r, int c){
        return matrix[r][c];
    }
    public int[][] getMatrixIn(){
        return this.matrix;
    }
    private boolean index(int r, int c) { return r >= 0 && r < row && c >= 0 && c < col; }

    public void matrixSum(int[][] matrix2) {
        if (this.matrix.length != matrix2.length ||
                this.matrix[0].length != matrix2[0].length) {
            System.out.println("Ошибка: Матрицы разных размеров нельзя сложить!");
            return;
        }

        int rows = this.matrix.length;
        int cols = this.matrix[0].length;

        int[][] matrixesSum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixesSum[i][j] = this.matrix[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Сумма матриц:");

        for (int i = 0; i < matrixesSum.length; i++) {
            System.out.println(Arrays.toString(matrixesSum[i]));
        }
    }
    public int getMatrixMultiply(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку и столбец: ");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        if (index(r1, c1)){
            int first = getMatrix(r1, c1);
            System.out.println("Введите множитель: ");
            int second = scanner.nextInt();
            return first*second;
        }else{
            System.out.println("Такой ячейки нет");
            return 0;
        }

    }

}
