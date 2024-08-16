package problems.strings;

/**
 * Created by dubeyapo on 9/17/2016.
 * Fremont Interview Preparation Group
 * Explain permutation and combinations in detail first (NpR and NcR). Then
 * Write a program to print all permutations of a given string
 * A permutation, also called an “arrangement number” or “order,” is a rearrangement of the elements of an ordered list S into a one-to-one correspondence
 * with S itself. A string of length n has n! permutation.
 * Below are the permutations of string ABC
 * ABC ACB BAC BCA CBA CAB
 */
public class permutationOfString {
        public static void main(String[] args) {
            permutation("abc");

            System.out.println("asdfgh".substring(0,5));
        }

        public static void permutation(String str) {
            permutation("", str);
        }

        //http://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string
        private static void permutation(String prefix, String str) {
            int n = str.length();
            if (n == 0) System.out.println(prefix);
            else {
                for (int i = 0; i < n; i++){
                    System.out.println("pre: " + prefix + " str.charAt(i):  " + str.charAt(i) +  " str.substring(0, i): " + str.substring(0, i) + " str.substring(i+1, n): " + str.substring(i+1, n) );
                    permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
                }
            }
        }
}
