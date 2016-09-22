package problems.strings;

import java.util.HashMap;

/**
 * Created by dubeyapo on 9/17/2016.
 * Fremont Interview Preparation Group
 * Returns the zero based index of the first occurrence of any character of str2 in str1
 * Input:
 * str1="adf6ysh"
 * str2="123678"
 * output: 3
 *
 */
public class findIndexOfChar {
    public static void main(String[] args) {
        System.out.println(findIndexOfChar("adf6ysh","12345678762364798723577857398476089023857435826"));
        System.out.println(findIndexOfChar("adfysh","12345678"));
        System.out.println(findIndexOfChar("adf6as6h","12345678"));
        System.out.println(findIndexOfChar("1234567876236479872357826798347534509809384509384509","adfh6ysh"));
    }

    private static int findIndexOfChar(String str1, String str2) {
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        String longer;
        String shorter;
        boolean str1IsLonger;
        if(str1.length()>str2.length()){
            longer = str1;
            shorter = str2;
            str1IsLonger = true;
        }
        else{longer = str2;
            shorter = str1;
            str1IsLonger = false;
        }

        int index = 0;
        for (Character ch : shorter.toCharArray()) {
            if (!hm.containsKey(ch)) {
                hm.put(ch,index);
            }
            index++;
        }
        for (int i = 0; i < longer.length(); i++) {
            if (hm.containsKey(longer.charAt(i))) {
                if(str1IsLonger) {return i;}
                else {return hm.get(longer.charAt(i));}
            }
        }
        return -1;
    }
}
