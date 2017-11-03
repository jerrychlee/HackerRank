/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    
    Node pA = headA;
    Node pB = headB;
    
    while(pA!=null && pB!=null) {
        
        if(pA == pB){
            return pA.data;
        }
        
        if(pA.next==null){
            pA = headB;
        }
        
        if(pB.next==null){
            pB = headA;
        }

        pA = pA.next;
        pB = pB.next;
        
    }
        
    return 0;
}