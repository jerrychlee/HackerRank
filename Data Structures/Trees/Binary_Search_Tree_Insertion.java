 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {

        if(root==null) {
            root = new Node();
            root.data = value;
            return root;
        }
    
        if(value < root.data){
            
            if(root.left!=null)
                Insert(root.left, value);
            else {
                root.left = new Node();
                root.left.data = value;
                return root;
            }
        }
        else {

            if(root.right!=null)
                Insert(root.right, value);        
            else {
                root.right = new Node();
                root.right.data = value;
                return root;
            }
        }

        return root;

}
