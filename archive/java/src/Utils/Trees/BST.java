package Utils.Trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apoorvadubey on 7/10/16.
 */
public class BST {
    private Node root;
    List<Integer> result = new ArrayList<Integer>();
    Integer counter = 0;

    public BST() {
        root = null;
    }

    public Node sortedArrayToBST(Integer[] array, int start, int end){
        if(start>end) return null;
        int mid = start + (end - start) / 2;
        Node node = new Node(array[mid]);
        node.left = sortedArrayToBST(array, start, mid - 1);
        node.right = sortedArrayToBST(array, mid + 1, end);
        return node;
    }

    @Override
    public String toString() {
        return null;
    }

    private void inOrderHelper (Node node){
        if(node.left!=null){inOrderHelper(node.left);}
        result.add(node.data);
        if(node.right!=null){inOrderHelper(node.right);}
    }
    public List<Integer> inOrder (Node node) {
        if (node != null) {
            inOrderHelper(node);
        }
        return result;
    }

    //201607102 Return the kth largest element
    public Integer findKthElement (Node node, int k) {
        if(node == null) return Integer.MIN_VALUE;
        Integer res = findKthElement(node.right, k);
        if(res != Integer.MIN_VALUE){return res;}
        counter++;
        if(counter == k){return node.data;}
        res = findKthElement(node.left,k);
        return res;
    }

    private class XYZ {
        public void method1(){
            System.out.print("Inside a public method of private value");
        }
    }
}
