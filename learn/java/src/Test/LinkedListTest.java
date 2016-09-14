package Test;

import Utils.LinkedList.LinkedList;
import Utils.LinkedList.LinkedList2;

/**
 * Created by apoorvadubey on 7/3/16.
 */
public class LinkedListTest {

    public static void main (String [] args){
        LinkedList2 ll = new LinkedList2();
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll.toString());
        System.out.println(ll.getLength());
        LinkedList l2 = new LinkedList();
    }
}
