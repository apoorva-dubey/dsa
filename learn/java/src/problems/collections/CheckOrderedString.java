package problems.collections;

import java.util.LinkedHashMap;

/**
 * Given an input string and ordering string, need to return true if the ordering string is present in Input string
 * Uber P1_1: https://www.careercup.com/question?id=5659201272545280
 * Created by apoorvadubey on 8/27/16.
 * If size of Input string = N
 * If size of ordered string = M
 * My algorithm : O(N + 2M)
 * Since general case would be N>>M, General Time complexity = O(N)
 *
 */
public class CheckOrderedString {

    public static void main(String [] args){
        System.out.println("hlo: " +isStringOrdered("hello world!", "hlo"));
        System.out.println("!od: " + isStringOrdered("hello world!", "!od"));
        System.out.println("he: " +isStringOrdered("hello world!", "he"));
        System.out.println("ac: " +isStringOrdered("aaaabbbcccc", "ac"));
        System.out.println("hlohlo: " +isStringOrdered("hello world!", "hlohlo"));
        System.out.println("eh: " +isStringOrdered("hello world!", "eh"));
    }

    private static boolean isStringOrdered(String str, String ordered) {
        LinkedHashMap<Character,Integer> lhm = new LinkedHashMap();
        for(int i=0; i<ordered.length();i++){
            lhm.put(ordered.charAt(i),-1);
        }
        for(int j=0; j<str.length();j++){
            Character c = str.charAt(j);
            if(lhm.containsKey(c)){
                lhm.put(c,j);
            }
        }

        for(int k=0;k<ordered.length()-1;k++){
            int prev = lhm.get(ordered.charAt(k));
            int cur = lhm.get(ordered.charAt(k+1));
            if(prev>cur){return false;}
        }
        return true;
    }
}