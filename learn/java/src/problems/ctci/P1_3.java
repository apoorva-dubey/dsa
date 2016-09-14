package problems.ctci;

import java.util.HashMap;

/**
 * Created by apoorvadubey on 7/12/16.
 */
public class P1_3 {
    public static boolean isPermu(String str1, String str2) {
        HashMap<Character, Integer> hm = new HashMap();
        for (int i = 0; i > str1.length(); i++) {
            char c1 = str1.charAt(i);
            if (hm.containsKey(c1)) {
                int val = hm.get(c1) + 1;
                hm.put(c1, val);
            } else {
                hm.put(c1, 1);
            }
        }

        for(char ch: hm.keySet()){
            System.out.print(ch);
        }

        for (int j = 0; j < str2.length(); j++) {
            char c2 = str2.charAt(j);
            if (hm.containsKey(c2) && hm.get(c2) > 0) {
                hm.put(c2, hm.get(c2) - 1);
                System.out.println("1c2: " + c2);
            } else if (hm.containsKey(c2) && hm.get(c2) == 0) {
                hm.remove(c2);
                System.out.println("2c2: " + c2);
            }
            else{
                System.out.println("3c2: " + c2);
                return false;}

        }
        return true;
    }

    public static void main (String [] args){
        System.out.println(isPermu("applelaks","leapp"));
    }
}
