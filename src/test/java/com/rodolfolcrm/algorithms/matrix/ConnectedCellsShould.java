package com.rodolfolcrm.algorithms.matrix;

import com.rodolfolcrm.algorithms.matrix.ConnectedCells;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConnectedCellsShould {

    @Test
    public void
    getBiggestRegion_return_minus_1_when_null() {
        int maxRegionSize = new ConnectedCells().getBiggestRegion(null);
        assertEquals(-1, maxRegionSize);
    }

    @Test
    public void
    getBiggestRegion_return_0() {
        int[][] matrix = {  {0, 0, 0},
                            {0, 0, 0},
                            {0, 0, 0}};
        int maxRegionSize = new ConnectedCells().getBiggestRegion(matrix);
        assertEquals(0, maxRegionSize);
    }

    @Test
    public void
    getBiggestRegion_return_1() {
        int[][] matrix = {  {0, 0, 1},
                            {0, 0, 0},
                            {0, 0, 0}};
        int maxRegionSize = new ConnectedCells().getBiggestRegion(matrix);
        assertEquals(1, maxRegionSize);
    }

    @Test
    public void
    getBiggestRegion_return_7() {
        int[][] matrix = {  {0, 0, 0, 1, 1, 0, 0},
                            {0, 1, 0, 0, 1, 1, 0},
                            {1, 1, 0, 1, 0, 0, 1},
                            {0, 0, 0, 0, 0, 1, 0},
                            {1, 1, 0, 0, 0, 0, 0},
                            {0, 0, 0, 1, 0, 0, 0}};
        int maxRegionSize = new ConnectedCells().getBiggestRegion(matrix);
        assertEquals(7, maxRegionSize);
    }
}