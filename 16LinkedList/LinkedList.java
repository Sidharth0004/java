import org.w3c.dom.Node;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Methods.
    // add()
    // remove()
    // print()
    // search()


                                                                 // ADD First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
                                             // ADD Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

                                              // Print LinkedList
    public void print() { // TC = 0(n)
        if (head == null) {
            System.out.println("ll is Empty");
            return;

        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }

                                                         // Add in the Middle
    public void add(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;

        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
                                                   // remove first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

                                                          // remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("Ll is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev: size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;

        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
                                                // search (Iterative method)
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {            
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }
                                                              // search(Recursive)
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
         if (head.data==key) {
              return 0;
         }
         int idx = helper(head.next, key);
         if (idx==-1) {
            return -1;
         }
         else {
       return  idx+1;
         }
    }

    public int recSearch(int key){
        return helper(head, key);
    }


     //                                                reverse the Linked List
       public void reverse(){
        Node prev = null;
        Node curr =tail= head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        head=prev;

       }

        //  ! Flipkart Qualcum Adobe
       public void deleteNthfromEnd(int n){
        // Calculate size
        int sz=0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            sz++;
        }
        if (n==sz) {
          head=head.next;      //remove first
        }

        //sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev =head;
        while (i<iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
       }


                                                     // PALINDROME
       // find mid
       public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;   //+1
            fast =fast.next.next; //+2

        }
          return slow; // slow is my mid node   
       }
       public boolean checkPalindrome(){
        if (head==null || head.next==null) {
            return true;
        }
        // step1 - find mid
           Node midNode = findMid(head);

        //step2 - reverse 2nd half
     Node prev = null;
      Node curr = midNode;
      Node next;
      while (curr!=null) {
        next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
      }

      Node right = prev ; // Right half head
      Node left = head; // left half head


        //step3 - check left half and right half
        while (right!=null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
       }

                                            // mergesort


     public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null  && fast.next != null) {
            slow = slow.next;
            fast= fast.next.next;
        }
        return  slow ; // mid
     }


     public Node merge ( Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else  {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
             temp.next = head1;
              head1 = head1.next;
                temp = temp.next;
        }
        while (head2 != null) {
               temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
        }
        return mergedLL.next;
     }



       public Node mergeSort(Node head){

        if ( head == null || head.next ==null) {
            return head;
        }
    
         // find mid
         Node mid = getMid(head);
          // left and right Ms
          Node rightHead = mid.next;
          mid.next = null;
         Node newLeft=  mergeSort(head);
         Node newRight = mergeSort(rightHead);

         // merge
         return merge (newLeft,newRight);




       }


                                                           //  alt mege - Zig-Zag merge 

        public void zigzag(){
            // find mid 
            Node slow = head;
            Node fast = head.next;
            while (fast!=null && fast.next!= null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

            //reverse

            Node curr = mid.next;
            mid.next = null;
          Node   prev = null;
          Node next;
          while (curr!=null) {
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
          }

          Node left = head;
          Node right = prev;
          Node nextL ,nextR;

            //alt merge - zigzag merge
            while (left != null && right != null) {
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next =nextL;

                left = nextL;
                right = nextR;
            }
        }


  
    // ! 
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.print();
        // ll.addFirst(2);
        // ll.addFirst(11);
        // ll.addFirst(7);
        // ll.addFirst(6);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();

        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);

        // ll.add(2, 9);
        // ll.print();

        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);

        // ll.removeLast();
        //    ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));
        // System.out.println(ll.recSearch(10));
        // ll.reverse();
        // ll.print();
        // ll.deleteNthfromEnd(3);
        // ll.print();


                                             //                PALINDROME
    //     ll.addLast(1);
    //     ll.addLast(2);
    //     ll.addLast(1);
    //  //   ll.addLast(1);
    //     ll.print();
        
    //     System.out.println(ll.checkPalindrome());

                                                                    
                                                               // Merge sort

            //         ll.addFirst(1);
            //         ll.addFirst(2);
            //         ll.addFirst(3);
            //         ll.addFirst(4);
            //         ll.addFirst(5);
            //         ll.print();

            // ll.head=ll.mergeSort(ll.head);
            // ll.print();
       
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.addLast(6);
            ll.print();    
            ll.zigzag();
            ll.print();
    
    }
}
