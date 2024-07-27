                             //! Pre order Traversal
import java.util.*;
import java.util.LinkedList;
public class BinaryTree1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data  = data;
            this.right = null;
            this.left  = null;
        }
    }
     static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx]==-1) {
              
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
           return newNode;
        }
          // Pre order
        public static void preorder(Node root){
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        
         //In-order
         public static void inorder(Node root){
            if (root == null ) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
         }
          
         // postorder
         public static void postorder(Node root){
                if (root == null) {
                    return;
                }
                postorder(root.left);  
                postorder(root.right);
                System.out.print(root.data+ " ");
         }

         // ! level order                                      - Microsoft , Adobe , Facebook
         public static void LevelOrder(Node root){
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                  else{
                    q.add(null);
                  }
                }else{
                    System.out.print(currNode.data +" ");
                    if (currNode.left !=null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right !=null) {
                        q.add(currNode.right);
                    }

                }
            }

         }
     }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);  
        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
        // tree.preorder(root);
        // System.out.println();
        // tree.inorder(root);
        // System.out.println();
        // tree.postorder(root);
        tree.LevelOrder(root);

    }

}
