package Utils.LinkedList;

/**
 * Created by apoorvadubey on 7/19/15.
 */
public class LinkedList {
    LinkedListNode head;

//    Constructors
    public LinkedList() {
    }

    public LinkedList(LinkedListNode head) {
        this.head = head;
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
        this.head = head;
    }

    public void addToHead(int data){
        LinkedListNode node = new LinkedListNode(data);
        node.setNext(head);
        this.head = node;
    }

    @Override
    public String toString(){
        LinkedListNode current = head;

        String result ="{";
        while(current!=null) {
            result+=current.toString();
            if(current.getNext()!=null){result+="->";}
            current = current.getNext();
        }
        result+="}";
        return result;
    }

    public int length(){
        int len=0;
        LinkedListNode node  = head;
        while(node!=null){
            len+=1;
            node=node.getNext();
        }
        return len;
    }
    public LinkedListNode deleteHead(){
        this.head=head.getNext();
        return head;
    }

    public int search(int item){
        int index=0;
        LinkedListNode current = head;
        while(current !=null){
            if(current.getData() == item)
            {
                return index;
            }
            current=current.getNext();
            index+=1;
        }
        return -1;
    }
}
