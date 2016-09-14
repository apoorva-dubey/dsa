package problems;


import Utils.LinkedList.LinkedListNode;

/**
 * Created by apoorvadubey on 7/25/15.
 */
public class LinkedListQ {

    public int findMiddleElementInLL(LinkedListNode head){
        if(head==null) return -1;
        LinkedListNode slow=head, fast = head;
        int midIndex=0;
        while (fast.getNext()!=null && fast.getNext().getNext() != null){
            fast=fast.getNext().getNext();
            slow=slow.getNext();
            midIndex+=1;
            System.out.println("Fast: "+ fast + " Slow: " + slow + " midInddex: " + midIndex);
        }
        if(fast.getNext()!=null)  midIndex+=1;
        return midIndex;
    }
}
