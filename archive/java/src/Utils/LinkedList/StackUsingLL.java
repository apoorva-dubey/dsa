package Utils.LinkedList;

/**
 * Created by apoorvadubey on 7/20/15.
 */
public class StackUsingLL {

    public LinkedListNode getTop() {
        return top;
    }

    LinkedListNode top;

    public int getLength() {
        return length;
    }

    int length;
    LinkedList list;

    public StackUsingLL() {
        list = new LinkedList();
        length=0;
    }

    public void insert(int item){
        list.addToHead(item);
        top=list.getHead();
        length+=1;
    }
    public LinkedListNode removeAtTop(){
        if(top==null) return null;
        else{
            LinkedListNode newNode = list.deleteHead();
            System.out.println("New Node: " + newNode);
            top= newNode;
            length--;
            return top;
        }
    }

    public int search(int value){
        return 0;
    }

}
