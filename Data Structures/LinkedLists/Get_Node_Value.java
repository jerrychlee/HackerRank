/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    Node dummy = new Node();
    dummy.next = head;
    int count = 0;
    
    Node p = dummy;        
    while(p.next!=null){
        count++;
        p = p.next;
    }
    
    if(n>count)
        return 0;
    
    p = dummy;
    
    for(int i=0;i<(count-n); i++) {
        p = p.next;
    }

    return p.data;
}