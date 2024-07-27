import org.w3c.dom.Node;
import java.util.*;
import java.util.ArrayList;

public class DeleteNode {
        static class Node {
          int data;
          Node left;
          Node right;

          Node(int data) {
              this.data = data;
             
          }

    }
    public static Node insert(Node root , int val){
        if (root ==  null) {
            root = new Node(val);
            return root;
        }

        if (root.data>val) {
          root.left =   insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    //! Search  a key in BST        -> 0(H)
    public static Boolean Search(Node root ,int key){
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        } if (root.data>key) {
            return Search(root.left, key);
        }
        else{
            return Search(root.right, key);
        }

        
    }
    //! delete  a node in BST
    public static Node delete(Node root, int val){
        if (root.data<val) {
            root.right = delete(root.right, val);
        }
        else if (root.data>val) {
            root.left = delete(root.left, val);
        }
        else{ // voila
            // case-1 Leaf Node 
            if (root.left == null && root.right == null) {
                return null;
            }

            // single child
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            // case 3 - both children
             Node IS = inorderSuccessor(root.right);
             root.data = IS.data;
             root.right =   delete(root.right, IS.data);

            
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // ! Print in RAnge
    public static void printInRange(Node root , int k1 ,int k2){
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        }
        else{
            printInRange(root.left, k1, k2);
        } 
    }
    // ! Root to Leaf Path
    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("NULL");
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
           printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }


    //! Validate BSt - Amozon

    public static boolean isValidBST(Node root , Node min , Node max) {
        if (root == null) {
            return true;
        }
        // System.out.println(min);
        if (min != null && root.data <= min.data ) {
            return false;
        }
        else if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root  = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        } 
        inorder(root);
        System.out.println();

      delete(root, 14);
      System.out.println();
      inorder(root);
      System.out.println();
   System.out.println("In range");
     printInRange(root, 1, 12);
     System.out.println();
     printRootToLeaf(root, new ArrayList<Integer>());
     System.out.println("Validate BST");
     if (isValidBST(root, null, null)) {
         System.out.println("Valid");
     } else{
        System.out.println("Not valid");
     }
    }
}
