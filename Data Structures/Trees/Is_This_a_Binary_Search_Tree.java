/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/
    boolean checkBST(Node root) {
 
        Stack s = new Stack();
        
        if(root==null)
            return true;
        
        traversal(root, s);
        return checkBST(s);
    }

    boolean checkBST(Stack s){

        while(!s.empty()){
            
            int a = (int)s.pop();
            
            if(!s.empty()){
                int b = (int)s.peek();
                if((a-b)<=0)
                    return false;
            }                
        }
        return true;
    }

    void traversal(Node root, Stack s){
        
        if(root==null)
            return;
        
        if(root.left!=null)
            traversal(root.left,s);
        
        s.push(root.data);
        
        if(root.right!=null)
            traversal(root.right,s);
        
        return;
    }