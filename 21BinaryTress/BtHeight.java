public class BtHeight {
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
    public static int height(Node root){
        if (root == null ) {
            return 0 ;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) +1;  
    }
    //! root count
    public static int count(Node root){
        if (root == null ) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount + rightCount + 1;
    }

    //! Sum of all Node
    public static int sum(Node root){
        if (root == null) {
            return 0;
        }

        int leftsum = sum(root.left);
        int rightSum = sum(root.right);
        return leftsum + rightSum + root.data;
    }
    
    //! Calculate Diameter - 0(N^2)
    // first Approach
    public static int diameter2(Node root){
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter2(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameter2(root.right);
        int rightHeight = height(root.right);

        int selfDiam = leftHeight + rightHeight +1;
        return  Math.max(selfDiam , Math.max(rightDiam, leftDiam));
    }
    static class Info{
        int diam ;
         int ht;

         public Info(int diam , int ht){
            this.diam = diam;
            this.ht = ht;

         }
    }

    public static Info Diameter(Node root){
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam) ,leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) +1;
        
        return new Info ( diam,ht);


    }


   public static void main(String[] args) {
            /*    1
                 / \
                2   3
               / \ / \
              4  5 6  7     */      
   
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

   System.out.println(height(root));
   System.out.println(count(root));
   System.out.println(sum(root));
   System.out.println(diameter2(root));
   System.out.println(Diameter(root).diam);

   }
}
