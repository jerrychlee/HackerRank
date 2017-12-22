/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        if(root==null){
            return true;
        }
        if(!checkLeft(root.left, root.data)||!checkRight(root.right, root.data)){
            return false;
        }
        if(!checkBST(root.left)||!checkBST(root.right)){
            return false;
        }
        return true;
    }

    boolean checkLeft(Node root, int val) {
        if(root==null){
            return true;
        }    
        if(root.data>=val){
            return false;
        }
        if(!checkLeft(root.left, val)){
            return false;
        }
        if(!checkLeft(root.right, val)){
            return false;
        }            
        return true;
    }

    boolean checkRight(Node root, int val) {
        if(root==null){
            return true;
        }    
        if(root.data<=val){
            return false;
        }
        if(!checkRight(root.left, val)){
            return false;
        }
        if(!checkRight(root.right, val)){
            return false;
        }            
        return true;        
    }
