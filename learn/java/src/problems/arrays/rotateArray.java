package problems.arrays;

/**
 * Tech Interview Study Group - Sept 3rd 2016
 * Rotate an array by integer N in-place
 * Inspired: http://www.geeksforgeeks.org/array-rotation/
 * Created by apoorvadubey on 9/3/16
 */
public class rotateArray {
    //Juggling algorithm
     /*Function to left rotate arr[] of siz n by d*/
        void leftRotate(int arr[], int d, int n)
        {
            int i, j, k, temp;
            for (i = 0; i < gcd(d, n); i++)
            {
            /* move i-th values of blocks */
                temp = arr[i];
                j = i;
                while (1 != 0)
                {
                    k = j + d;
                    System.out.println("before: "  + j + k);
                    if (k >= n)
                        k = k - n;
                    if (k == i)
                        break;
                    System.out.println("after: "  + j + k);
                    arr[j] = arr[k];
                    j = k;
                    for(int p = 0;p<arr.length;p++){System.out.print(arr[p] + " ");}
                    System.out.println("");
                }
                arr[j] = temp;
            }
        }

    /*UTILITY FUNCTIONS*/

    /* function to print an array */
        void printArray(int arr[], int size)
        {
            int i;
            for (i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
        }

    /*Fuction to get gcd of a and b*/
        int gcd(int a, int b)
        {
            if (b == 0)
                return a;
            else
                return gcd(b, a % b);
        }

        // Driver program to test above functions
        public static void main(String[] args) {
            rotateArray rotate = new rotateArray();
            int arr[] = {1, 2, 3, 4, 5};
            rotate.leftRotate(arr, 3, 5);
            rotate.printArray(arr, 5);
        }
}
