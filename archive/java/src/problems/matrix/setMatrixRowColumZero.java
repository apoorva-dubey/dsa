package problems.matrix;

/**
 * http://www.programcreek.com/2012/12/leetcode-set-matrix-zeroes-java/
 * Created by apoorvadubey on 9/10/16.
 */
public class setMatrixRowColumZero {
    public static void main(String[] args) {
        int [] [] matrix = {{1,0,1},{1,1,1},{1,1,1}};
        setMatrixRowColZero1(matrix);
    }

    private static void setMatrixRowColZero1(int [][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int level = 0;

    }

}
