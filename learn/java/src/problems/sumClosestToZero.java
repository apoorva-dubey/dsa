package problems;

/**
 * Created by apoorvadubey on 3/7/16.
 */
public class sumClosestToZero {
    public static void main(String [] args){
        int [] array1 = {15,18,30};
        int [] result1 = closestToZero(array1);
        for(int i : result1){
            System.out.println(i);
        }
        int [] array2 = {-7,-10,6};
        int [] result2 = closestToZero(array2);
        for(int i : result2){
            System.out.println(i);
        }
    }

    private static int[] closestToZero(int[] array) {
        if(array.length<=2) return null;
        int [] result = new int[2];
        java.util.Arrays.sort(array);
        int left = 0;
        int right = array.length-1;
        int offset = array[left]+array[right];
        while(left<right) {
            if (Math.abs(array[left]+array[right])<Math.abs(offset)) {
                offset = array[left]+array[right];
                result[0]=array[left];
                result[1]=array[right];
            }
            if(offset<0){
                left++;
            }
            else
                right--;
            }
        return result;
        }
}

