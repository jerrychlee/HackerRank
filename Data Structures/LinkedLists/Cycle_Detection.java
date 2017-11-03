/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    
    if(head == null)
        return false;
    if(head.next == null)
        return false;
    
    Node p = head;
    Node q = head;
    
    while(true){        
        
        p = p.next;
        q = q.next;
        if(q.next!=null)
            q = q.next;
        else
            return false;
        
        if(p==null||q==null)
            return false;
        
        if(p == q)
            return true;
    }
    
}