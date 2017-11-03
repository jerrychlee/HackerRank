/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    
    Node idxNode = head;
    
    if(idxNode == null )
        return head;
    
    while(idxNode.next != null) {
        
        if(idxNode.data == idxNode.next.data)
            idxNode.next = idxNode.next.next;
        else
            idxNode = idxNode.next;
        
    }
    
    return head;
}