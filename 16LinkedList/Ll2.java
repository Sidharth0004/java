import java.util.LinkedList;   // JCF -> )ptimized
public class Ll2 {


      private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
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
if (head == null || head.next == null) {
    return head;
}
    //to find mid
    Node min = getMid();
    //left & right ms
    Node rightHead = mid.next;
    mid.next = null;
   Node newLeft =  mergeSort(head);
   Node newRight =  mergeSort(rightHead);

    //merge
    return merge(newLeft , newRight);

} 


    
    public static void main(String[] args) {
        
        //create
        LinkedList<Integer> ll = new LinkedList<>();
         ll.addFirst(1);
         ll.addFirst(2);
         ll.addFirst(3);
         ll.addFirst(4);
         ll.addFirst(5);
         System.out.println(ll);

         ll.head = ll.mergeSort(ll.head);
         
    }
}




