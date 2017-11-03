void Print(Node head) {
  
    Node p = head;
    
    while(p != null){
        System.out.println(p.data);
        p = p.next;
    }
}
