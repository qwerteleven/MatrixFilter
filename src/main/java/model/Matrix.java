package model;

/**
 *
 * @author Mario
 */

public class Matrix {
    private final int[][] values;
    private final int min;
    private final int max;
    private int threshold;

    public Matrix(int size, int min, int max) throws Exception {
        if (min > max) throw new Exception("Matrix max can`t be less than min");
        
        this.min = min;
        this.max = max;
        this.threshold = min;
        
        values = randomMatrix(size);
    }

    private int[][] randomMatrix(int size) {
        int[][] matrix = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) Math.round((Math.random() * (max - min) + min));
                
            }
        }
        return matrix;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public String toString() {
        String string = "";
        
        for (int[] row : values) {
            for (int element : row) {
                string += (element >= threshold) ? element + "\t" : "-\t";
            }
            string += "\n";
        }
        
        return string.trim();
    }
}
