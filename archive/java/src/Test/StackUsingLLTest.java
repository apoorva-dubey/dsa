package Test;

import Utils.LinkedList.StackUsingLL;

/**
 * Created by apoorvadubey on 7/20/15.
 */
public class StackUsingLLTest {


    public static void main(String args[]) {
        StackUsingLL stack1 = new StackUsingLL();
        stack1.insert(5);
        stack1.insert(67);
        stack1.insert(63);
        stack1.insert(12);
        stack1.insert(89);

        System.out.println("---");

        System.out.println(stack1.getLength());
        System.out.println(stack1.getTop());

        System.out.println("---");
        System.out.println(stack1.removeAtTop());

        System.out.println("---");
        System.out.println(stack1.getLength());
        System.out.println(stack1.getTop());

        System.out.println(stack1.removeAtTop());

        System.out.println("---");
        System.out.println(stack1.getLength());
        System.out.println(stack1.getTop());
    }
}
