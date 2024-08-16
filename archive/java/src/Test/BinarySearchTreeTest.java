package Test;

import Utils.Trees.BST;
import Utils.Trees.Node;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by apoorvadubey on 7/3/16.
 */
public class BinarySearchTreeTest {
    public static void main(String [] args) {
        BST bst1 = new BST();
        Integer[] arr1 = {1, 2, 3, 5, 7, 8, 18, 100};
        Node root1 = bst1.sortedArrayToBST(arr1, 0, arr1.length - 1);
        ArrayList<Integer> res = (ArrayList<Integer>) bst1.inOrder(root1);
//        System.out.print(bst.findKthElement(root, 1));
        BST bst2 = new BST();
        Integer[] arr2 = {1, 2, 3, 5, 7, 8, 18};
        Node root2 = bst2.sortedArrayToBST(arr2, 0, arr2.length - 1);
        ArrayList<Integer> res2 = (ArrayList<Integer>) bst2.inOrder(root2);
        System.out.println(isIsomorphic(root1, root2));
    }

    //201607104 boolean that two trees are isomorphic
    public static boolean isIsomorphic (Node n1, Node n2) {
        System.out.println(n1 +" "+n2);
        if (n1 == null && n2 == null) return true;
        else if(n1 == null ||  n2 == null) return false;
        return isIsomorphic(n1.left, n2.left) && isIsomorphic(n1.right, n2.right);
    }

//    @Test
//    public void isIsomorphicTest (){
//        BST bst = new BST();
//        Integer[] arr = {1, 2, 3, 5, 7, 8, 18, 100};
//        Node root = bst.sortedArrayToBST(arr, 0, arr.length - 1);
//        ArrayList<Integer> res = (ArrayList<Integer>) bst.inOrder(root);
//        assertEquals("" + bst.findKthElement(root, 1),100);
//    }


}