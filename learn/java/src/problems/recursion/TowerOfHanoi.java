package problems.recursion;

import java.util.Stack;

/**
 * Created by apoorvadubey on 9/6/16.
 */
public class TowerOfHanoi {

    public static void main(String [] args){
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        Stack s3 = new Stack();
        int n = 4;
        for(int i = 1 ; i < n; i++){
            s1.push(i);
        }
        System.out.println(s1.toString());
        System.out.println("s1: " + s1.size() + " s2: " + s2.size() + " s3: " + s3.size());
        transfer(s1, s2, s3, s1.size());
        System.out.println("s1: " + s1.size() + " s2: " + s2.size() + " s3: " + s3.size());
        System.out.println(s2.toString());
    }

    private static void transfer(Stack from, Stack to, Stack helper, int n) {
        if(n >= 1){
            transfer(from, helper, to, n - 1);

            to.push(from.pop());
            System.out.println(from.toString() + " -> " + to.toString() + " using: " + helper.toString());

            transfer(helper, to, from, n - 1);
        }

        System.out.println("--");
    }
}
