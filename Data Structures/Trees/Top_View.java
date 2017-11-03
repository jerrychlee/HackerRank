   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */

void topView(Node root) {
    
    if(root==null)
        return;

    leftOnly(root.left);
    System.out.print(root.data + " ");
    rightOnly(root.right);
}

void leftOnly(Node root){
    
    if(root==null)
        return;
    
    leftOnly(root.left);
    System.out.print(root.data + " ");
}   

void rightOnly(Node root){
    
    if(root==null)
        return;
    
    System.out.print(root.data + " ");
    rightOnly(root.right);
}   
