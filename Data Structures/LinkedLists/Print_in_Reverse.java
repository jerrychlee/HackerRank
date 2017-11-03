/*
  Print elements of a linked list in reverse order 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Stack stack = new Stack();
    
    Node p = head;
    
    while(p != null) {
        
        stack.push(p.data);
        
        p = p.next;
    }
    
    while(!stack.isEmpty()) {
        
        System.out.println(stack.pop());
    
    }

}
