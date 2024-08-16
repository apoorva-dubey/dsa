package problems.matrix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
	https://www.careercup.com/question?id=19369681
	Longest Ski path in Elevation Matrix
 * Created by dubeyapo on 9/16/2016.
 */
public class skiLongestPath {
    public static int [][] checker;
        public static void main(String[] args) {
            int [][] elevationMatrix = {{1,3,4,5},{1,2,7,4},{1,6,4,7}};
            print(elevationMatrix);
            System.out.println(longestPathInMatrix(elevationMatrix));
            print(checker);
        }

        private static int longestPathInMatrix(int [][] elevationMatrix) {
            int row = elevationMatrix.length;
            int col = elevationMatrix[0].length;
            checker = new int [row][col];
            int maxPath=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    checker[i][j] = -1;
                }
            }
            return longestPathInMatrixHelper(elevationMatrix,0,0,checker, maxPath);
        }

    private static int longestPathInMatrixHelper(int[][] elevationMatrix, int row, int col, int[][] checker, int maxPath) {
        if(row<0||row>=elevationMatrix.length||col<0||col>=elevationMatrix[0].length) return 0;
        if(checker[row][col]!=-1){return checker[row][col];}
        int val = elevationMatrix[row][col];
        System.out.println("row: " + row + " col: " + col);
        int down = longestPathInMatrixHelper(elevationMatrix,row+1,col,checker,maxPath);
        int right = longestPathInMatrixHelper(elevationMatrix,row,col+1,checker,maxPath);
//        int left = longestPathInMatrixHelper(elevationMatrix,row-1,col,checker,maxPath);
//        int up = longestPathInMatrixHelper(elevationMatrix,row,col-1,checker,maxPath);
        if(val<down&&val<right){checker[row][col] = 0;return maxPath;}
        checker[row][col] = biggest(down+1,right+1);
        return Math.max(maxPath,checker[row][col]);
    }
    private static int biggest(int a,int b){
        int largest =a;
        if(largest<b) largest = b;
//        if(largest<c) largest = c;
//        if(largest<d) largest = d;
        return largest;
    }

    private static void print (int [][] mtrix) {
        int rows = mtrix.length;
        int col = mtrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mtrix[i][j] + "	");
            }
            System.out.println();
        }
    }
}