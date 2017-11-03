/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    
    Node idxNode = head;
    Node lastNode = head;
    
    if(head==null || head.next==null)
        return head;
    
    while(idxNode!=null) {
        
        Node next = idxNode.next;
   
        if(next==null)
            lastNode = idxNode;
        
        idxNode.next = idxNode.prev;
        idxNode.prev = next;
        idxNode = next;
    }
    return lastNode;    
}
