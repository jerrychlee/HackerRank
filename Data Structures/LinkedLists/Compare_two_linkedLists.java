/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 

    if(headA==null || headB==null)
        return 0;

    Node pA = headA;
    Node pB = headB;
    
    while(pA!=null && pB!=null){
        if(pA.data != pB.data)
            return 0;
        pA = pA.next;
        pB = pB.next;
    }
    
    if(pA==null&&pB==null)
        return 1;
    
    return 0;
}
