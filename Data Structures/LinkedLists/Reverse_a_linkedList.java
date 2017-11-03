/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {

    Node dummy = new Node();
    dummy.data = 0;
    dummy.next = head;
    Node first = head;
    
    Node p = dummy;
    Node index = dummy; 
        
    while(p.next!=null) {
        
        if(p.next.next!=null)
            p = p.next;
        else{
            if(p.next==first)
                 break;
            p.next.next = index.next;
            index.next = p.next;
            index = index.next;
            p.next = null;
            p = dummy;
        }
        
    }
    
    return dummy.next;
}
