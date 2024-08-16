package problems.ctci;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by apoorvadubey on 7/12/16.
 */
public class P1_1 {

    public static boolean isUniqueChars(String str){
        Boolean [] characters = new Boolean[256];
        Arrays.fill(characters,false);


        for(int i = 0 ; i < str.length() ; i ++){
            int pos = str.charAt(i) - 65;
//            System.out.println(pos +"<-pos char -> "+ str.charAt(i));
            if(!characters[pos]){characters[pos] = true;}
            else return false;
        }
        return true;
    }

    public static boolean isUniqueChars2(String str){
        HashSet hs = new HashSet();
        for(int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            if(hs.contains(c)){return false;}
            else {
                hs.add(c);
            }
        }
        return true;
    }

    public static void main (String [] args){
        System.out.println(isUniqueChars2("syonksckjbd"));
        System.out.println(isUniqueChars2("sadfghjklpoqiw"));
        System.out.println(isUniqueChars2("qwertyuioplaksjdhfbxnzmAS"));
    }
}