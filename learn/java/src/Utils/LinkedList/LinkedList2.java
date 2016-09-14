package Utils.LinkedList;

/**
 * Created by apoorvadubey on 7/3/16.
 */
public class LinkedList2 {
    LinkedListNode2 root;
    int length;
    public void MyLinkedList() {
    }
    public void add(Object value){
        LinkedListNode2 node = new LinkedListNode2(value);
        if(this.root == null){
            this.root = node;
        }
        else {
            LinkedListNode2 current = this.root;
            while(current!=null){
                current= current.next;
            }
            current = node;
        }
        this.length++;
    }

    public int getLength(){
        return length;
    }
    public boolean remove(int index){
        return false;
    }
    public void add(Object value, int index){

    }
    public boolean findCycle(){
        return false;
    }
    public int search(Object key) {
        if (root == null) return -1;
        LinkedListNode2 current = root;
        return 0;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("{");
        String res = "{";
        LinkedListNode2 current = root;
        for(int i=0 ; i< this.length-1; i++){
            System.out.println(current.data);
            res+=current.data + ", ";
            current = current.next;
        }
        return res;
    }

}