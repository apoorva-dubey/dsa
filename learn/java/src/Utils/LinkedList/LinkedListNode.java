package Utils.LinkedList;

/**
 * Created by apoorvadubey on 7/19/15.
 */
public class LinkedListNode {

    private int data;
    private LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;

    }

    public int getData() {
        return data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setData(int item) {
        this.data = item;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return "" + this.data;
    }
}
