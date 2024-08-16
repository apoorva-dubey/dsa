package problems.strings;

/**
 * Created by dubeyapo on 9/17/2016.
 * Fremont Interview Preparation Group
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string.
 */
public class stringCompression {

    public static void main (String [] args ){
        System.out.println(compress("ab"));
    }

    private static String compress(String str) {
        if(str == "" || str.length() == 1){return str+1;}
        StringBuffer sb = new StringBuffer();
        char nextChar;
        int counter = 0;
        int i;
        for(i =0; i<str.length()-1; i++){
            counter++;
//            System.out.println("i: "+ i );
            if(str.charAt(i+1)== str.charAt(i)){
                continue;
            }
            else {
                sb.append(str.charAt(i));
                sb.append(counter);
                counter=0;
            }
        }
        counter++;
        sb.append(str.charAt(i));
        sb.append(counter);
        return sb.toString();
    }


}
