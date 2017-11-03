/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    
    Node dummy = new Node();
    dummy.data = 0;
    dummy.next = null;
    
    Node pA = headA;
    Node pB = headB;
    Node index = dummy;
    
    if(pA==null && pB==null)
        return null;
    if(pA==null)
        return pB;
    if(pB==null)
        return pA;
    
    while(pA!=null&&pB!=null) {
        
        if(pA.data<=pB.data) {
            index.next = pA;            
            pA = pA.next;
        }else{
            index.next = pB;            
            pB = pB.next;
        }        
        index = index.next;
        index.next = null;
    }
    
    if(pA!=null)
        index.next = pA;
    else
        index.next = pB;
        
    return dummy.next;    

}