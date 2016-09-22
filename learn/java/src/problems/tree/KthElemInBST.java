package problems.tree;

import Utils.Trees.BST;
import Utils.Trees.Node;

/**
 *
 * Created by dubeyapo on 9/19/2016.
 * Find kth element from biggest value in a BST
 */
public class KthElemInBST {
    public static void main(String [] args){
        BST bst = new BST();
        Integer [] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};
        Node root = bst.sortedArrayToBST(arr,0,arr.length);

    }
}
