package com.rodolfolcrm.algorithms.matrix;

public class ConnectedCells {

    public int getBiggestRegion(int[][] matrix) {
        if (matrix == null) return -1;

        int biggestRegion = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 1) {
                    int regionSize = getRegionSize(matrix, row, column);
                    biggestRegion = Math.max(biggestRegion, regionSize);
                }
            }
        }
        return biggestRegion;
    }

    private int getRegionSize(int[][] matrix, int row, int column) {
        if (row < 0 || row >= matrix.length || column < 0 || column >= matrix[row].length) {
            return 0;
        }
        if (matrix[row][column] == 0) {
            return 0;
        }
        int regionSize = 1;
        matrix[row][column] = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                regionSize += getRegionSize(matrix, i, j);
            }
        }
        return regionSize;
    }
}
