/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
        StringBuffer out = new StringBuffer();
        Node idx = root;
            
        for(int i=0; i<S.length(); i++){
            char p = S.charAt(i);
            if(p=='1'){
                idx = idx.right;    
            }else{
                idx = idx.left;                
            }

            if(idx.right==null && idx.left==null){
                out.append(idx.data);
                idx = root;
            }
        }
        System.out.print(out);        
    }