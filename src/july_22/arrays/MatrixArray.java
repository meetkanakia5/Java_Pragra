package july_22.arrays;

public class MatrixArray {
    public static void main(String[] args) {
        int matrix[][] = {{2,3,4}, {5,6,7}, {8,9,2}};

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
