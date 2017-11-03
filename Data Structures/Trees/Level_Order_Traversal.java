   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {

       if(root==null)
           return;
       
       Queue q = new LinkedList();
       q.add(root);
       
       while(q.peek()!=null){
           Node i = (Node)q.poll();
           System.out.print(i.data + " ");
           if(i.left!=null)
               q.add(i.left);
           if(i.right!=null)
               q.add(i.right);
       }
   }
