package problems;

/**
 * Created by apoorvadubey on 3/7/16.
 */
public class longestSkiPathInElevationMatrix {

    public static void main (String [] args){
        int [][] matrix = new int[][]{
                {3,5,3},
                {2,3,4},
                {1,0,1}
        };
        System.out.println(findLongestSkiPath(matrix));

    }

    private static int findLongestSkiPath(int [][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] maxPath =new int [row][col];
        //Create a maxPath array of size = matrix
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                maxPath[row][col]=-1;
            }
        }
        findMax(matrix, maxPath,0,0);
        return 0;
    }

    private static int findMax(int[][] matrix, int[][] maxPath,int row,int col) {
       int val= matrix[row][col];
        int below = (row+1<matrix.length)?matrix[row+1][col]:Integer.MAX_VALUE;
        int left=(col-1>0)?matrix[row][col-1]:Integer.MAX_VALUE;
        int right=(matrix[0].length < col)?matrix[row][col+1]:Integer.MAX_VALUE;
        if(val>below&&val>left&&val>right){
            return 1;
        }
        return 0;
    }
}
