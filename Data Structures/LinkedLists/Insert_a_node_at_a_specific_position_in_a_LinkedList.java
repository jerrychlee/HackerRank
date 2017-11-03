/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node node = new Node();
    node.data = data;
    node.next = head;
 
    Node p = node;
  
    if(position==0)
        return p;
    
    for(int i=0; i<position; i++){
        p = p.next;
    }
    
    node.next = p.next;
    p.next = node;
   
    return head;    
}