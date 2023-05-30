package pl.session5mi637;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;



public class TestDiagonalesTest {

    @Test
    public void testGetDiagonals() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] expectedDiagonals = {
                {1, 5, 9},
                {3, 5, 7}
        };

        TestDiagonales diagonal = new TestDiagonales();
        int[][] result = diagonal.getDiagonals(matrix);

        assertArrayEquals(expectedDiagonals, result);
    }

    @Test
    public void testAddColumns() {
        double[][] matrix = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };

        double[] expectedColumnSums = {12.0, 15.0, 18.0};
        double[] actualColumnSums = TestDiagonales.addColumns(matrix);

        Assert.assertArrayEquals(expectedColumnSums, actualColumnSums, 0.0001);
    }

    @Test
    public void testAddColumnsEmptyMatrix() {
        double[][] matrix = {};

        double[] expectedColumnSums = {};
        double[] actualColumnSums = TestDiagonales.addColumns(matrix);

        Assert.assertArrayEquals(expectedColumnSums, actualColumnSums, 0.0001);
    }

    @Test
    public void testAddColumnsSingleValueMatrix() {
        double[][] matrix = {{5.0}};

        double[] expectedColumnSums = {5.0};
        double[] actualColumnSums = TestDiagonales.addColumns(matrix);

        Assert.assertArrayEquals(expectedColumnSums, actualColumnSums, 0.0001);
    }



    @Test
    public void testAddColumnsNegativeValues() {
        double[][] matrix = {
                {-1.0, -2.0, -3.0},
                {-4.0, -5.0, -6.0},
                {-7.0, -8.0, -9.0}
        };

        double[] expectedColumnSums = {-12.0, -15.0, -18.0};
        double[] actualColumnSums = TestDiagonales.addColumns(matrix);

        Assert.assertArrayEquals(expectedColumnSums, actualColumnSums, 0.0001);
    }

    @Test
    public void testAddColumnsZeroValues() {
        double[][] matrix = {
                {0.0, 0.0, 0.0},
                {0.0, 0.0, 0.0},
                {0.0, 0.0, 0.0}
        };

        double[] expectedColumnSums = {0.0, 0.0, 0.0};
        double[] actualColumnSums = TestDiagonales.addColumns(matrix);

        Assert.assertArrayEquals(expectedColumnSums, actualColumnSums, 0.0001);
    }


}