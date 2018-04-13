/*
 Linked List is a data structures used for storing collection of elements or 
objects or nodes having following pproperties

1. It contains sequence of nodes.
2. A node has data and reference to next Node.
3. First node is the head node.
4. Last node has data and points to null.
 */

// Below Program shows how to represent linklist in java

package datastructures;

/**
 *
 * @author admin
 */
public class SinglyLinkedlist {
    
    private ListNode head; // Head node to hold the list
    //It contains a static inner class ListNode
    private static class ListNode {
        private int data;
        private ListNode next;
        
        // Create Constructor which will initialize new node data passed in argument
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
        
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
