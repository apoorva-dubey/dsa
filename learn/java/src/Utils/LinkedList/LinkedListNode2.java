package Utils.LinkedList;

/**
 * Created by apoorvadubey on 7/3/16.
 */
public class LinkedListNode2<T>{
    T data;
    LinkedListNode2 next;

    //Default Constructor
    public LinkedListNode2(){}

    public LinkedListNode2(T data){
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListNode2 getNext() {
        return next;
    }

    public void setNext(LinkedListNode2 next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return "" + this.data;
    }
}
