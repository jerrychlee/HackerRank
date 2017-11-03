/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node dummy = new Node();
    dummy.data = 0;
    dummy.next = head;

    if(head == null)
        return null;
        
    Node p = dummy;
    
    for(int i=0; i<position; i++)
        p = p.next;        
    
    Node pp = p.next.next;
    p.next = pp;

    return dummy.next;
}

