	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here
        return preOrder(root, 0);
    }

    static int preOrder(Node root, int count) {
        
        if(root==null)
            return 0;

        if(root.left== null && root.right== null)
            return count;
        
        return Math.max(preOrder(root.left, count+1),preOrder(root.right, count+1));
    }