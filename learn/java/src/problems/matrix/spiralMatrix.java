package problems.matrix;

/**
 * Created by dubeyapo on 9/20/2016.
 */
public class spiralMatrix {

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(matrix);
        System.out.println();
        printSpiral(matrix);
    }


    private static void printSpiral(int [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int level = 0; level < Math.floor(rows/2);level++){
            //go right
            int i = level;
            int j = level;

            while(j<cols-1){System.out.print(matrix[i][j] + " ");j++;}
            while(i<rows-1){System.out.print(matrix[i][j] + " ");i++;}
            while(j>0){System.out.print(matrix[i][j] + " ");j--;}
            while(i>0){System.out.print(matrix[i][j] + " ");i--;}
        }
    }

    private static void print (int [][] mtrix) {
        int rows = mtrix.length;
        int cols = mtrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mtrix[i][j] + "	");
            }
            System.out.println();
        }
    }


}