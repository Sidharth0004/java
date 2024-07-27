import org.w3c.dom.Node;
import java.util.*;
import java.util.ArrayList;

public class lca {
        
    static class Node{
        int data;
        Node left ;
        Node right;
         
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static boolean getPAth(Node root,  int n , ArrayList<Node> path){
       if (root == null) {
           return false;
       } 

       path.add(root);
        if (root.data == n) {
           return true; 
        }
    boolean foundLeft =  getPAth(root.left, n, path);
    boolean foundRight =  getPAth(root.right, n, path);

    if (foundLeft ||foundRight) {
        return true; 
    }

    path.remove(path.size()-1);
    return false;
    }

    public static Node Lca(Node root , int n1 , int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPAth(root , n1 , path1);
        getPAth(root , n2 , path2);

        // last common ancestor
        int i = 0;
        for ( ;  i < path1.size() && i< path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // last equal node 
        Node lca = path1.get(i-1);
        return lca;
    }


    //! Approach 2
     public static Node lca2(Node root , int n1, int n2 ){
        if (root == null) {
            return root; 
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
      Node leftlca =   lca2(root.left  , n1 , n2);
      Node rightlca =  lca2(root.right , n1 , n2);

      // leftlca = valid val    rightlca = null
      if (rightlca == null ) {
        return leftlca;
      }
      if (leftlca == null) {
        return rightlca;
      }

      return root;
     }
    


     //! Min  Distnce


     public static int lcaDist( Node  root , int n){
      if (root == null) {
        return -1;
      }
      
      if (root.data == n) {
        return 0;
      }
       
      int leftDist = lcaDist(root.left, n);
      int rightDist = lcaDist(root.right, n);

      if (leftDist == -1 && rightDist ==-1) {
        return -1;
      }
      else if (leftDist == -1) {
       return rightDist +1;
      } else{
       return leftDist +1;
      }
     }
     public static int minDist(Node root , int n1 , int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);
        return dist1 + dist2;
     }

     //! Kth ancestor
     public static int KAncestor( Node root , int n , int k){
       if (root == null) {
         return -1;
       }
      
      
        if (root.data == n) {
            return 0;
        }

        int leftDis = KAncestor(root.left, n, k);
        int rightDis = KAncestor(root.right, n, k);

        if (leftDis == -1 && rightDis ==-1) {
            return -1;
        }
        int max = Math.max(leftDis, rightDis);
        if (max+1 == k) {
            System.out.println(root.data);
        }
        return max+1;
     }
    public static void main(String[] args) {
         /*         1
                   / \
                  2   3
                 / \ / \
                4  5 6  7        
                             
                */ 
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

         int n1 =4 , n2 = 7;
         System.out.println(Lca(root, n1, n2).data);
         System.out.println(lca2(root, n1, n2).data);

         System.out.println("Min dis = " + minDist(root, n1, n2));

         int n =4 , k =1;
         KAncestor(root, n, k);
    }
}
