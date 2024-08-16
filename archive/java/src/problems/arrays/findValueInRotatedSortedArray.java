package problems.arrays;

/**
 * Fremont Interview Preparation Group
 * Created by apoorvadubey on 9/10/16.
 */
public class findValueInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(minimum(new int[]{}));
        System.out.println(minimum(new int[]{6, 7, 8, 9, 1}));
        System.out.println(minimum(new int[]{1,2,3,4,5,6, 7, 8, 9}));
    }

    private static int minimum(int[] arr) {
        if(arr.length == 0){return -1;}
        if(arr.length == 1 || arr[0]<arr[arr.length-1]){return arr[0];}
        int lo = 0;
        int hi = arr.length;
        int mid=0;
        while(lo<hi){
            mid = lo + (hi - lo)/2;
//            System.out.println("lo: " + lo +" hi: "+ hi + " mid: " + mid);
            if(arr[mid]<arr[mid-1]){return arr[mid];}
            else if(arr[mid]>arr[0]){lo=mid+1;}
            else {hi=mid-1;}
        }
        return arr[0];
    }
}
