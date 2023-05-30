package pl.session5mi637;

public class TestDiagonales {
    public int[][] getDiagonals(int[][] matrix) {
        int n = matrix.length;
        int[][] diagonals = new int[2][n];

        for (int i = 0; i < n; i++) {
            diagonals[0][i] = matrix[i][i];
            diagonals[1][i] = matrix[i][n - 1 - i];
        }

        return diagonals;
    }

    public static double[] addColumns(double[][] matrix) {
        int size = matrix.length;
        double[] columnSums = new double[size];

        for (int col = 0; col < size; col++) {
            double sum = 0.0;
            for (int row = 0; row < size; row++) {
                sum += matrix[row][col];
            }
            columnSums[col] = sum;
        }

        return columnSums;
    }




}
