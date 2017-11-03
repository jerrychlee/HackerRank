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

Node SortedInsert(Node head,int data) {
    Node n = new Node();
    n.data = data;
    n.next = null;
    n.prev = null;
    
    if(head==null)
        return n;
    
    Node p = head;
    Node last = head;
        
    while(p!=null)
    {
        if(data <= p.data)
        {
            if(p.prev!=null)
            {
                p.prev.next = n;
                n.prev = p.prev;            
                n.next = p;
                p.prev = n;
                return head;
            }
            else{
                n.next = p;
                p.prev = n;
                return n;
            }
        }
        else
        {
            if(p.next==null){
                last=p;                
            }
            p = p.next;
        }
    }
    
    last.next = n;
    n.prev = last;
        
    return head;
}
